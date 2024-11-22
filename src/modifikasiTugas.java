import java.util.Scanner;

public class modifikasiTugas {
    private static String[] mahasiswa;
    private static int[][] nilai;

    public static void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan nilai untuk mahasiswa: " + 
mahasiswa[i]);
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai tugas ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Data nilai berhasil dimasukkan!\n");
    }
    public static void tampilkanNilai() {
        System.out.println("Rekap Nilai:");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void mahasiswaNilaiTertinggi() {
        int maxNilai = 0;
        String mahasiswaTertinggi = "";
        for (int i = 0; i < mahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j];
            }
            if (totalNilai > maxNilai) {
                maxNilai = totalNilai;
                mahasiswaTertinggi = mahasiswa[i];
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mahasiswaTertinggi + " dengan total nilai: " + maxNilai + "\n");
    }
    public static void rataRataNilai() {
        System.out.println("Rata-rata nilai untuk setiap mahasiswa:");
        for (int i = 0; i < mahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j];
            }
            double rataRata = (double) totalNilai / nilai[i].length;
            System.out.println(mahasiswa[i] + ": " + rataRata);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine();

        mahasiswa = new String[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
        System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
        mahasiswa[i] = scanner.nextLine();
    }
    System.out.print("Masukkan jumlah tugas: ");
    int jumlahTugas = scanner.nextInt();

    nilai = new int[jumlahMahasiswa][jumlahTugas];

    while (true) {
        System.out.println("=== Menu Rekap Nilai ===");
        System.out.println("1. Input data nilai");
        System.out.println("2. Tampilkan seluruh data nilai");
        System.out.println("3. Tampilkan mahasiswa dengan nilai tertinggi");
        System.out.println("4. Tampilkan rata-rata nilai");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                inputNilai();
                break;
            case 2:
                tampilkanNilai();
                break;
            case 3:
                mahasiswaNilaiTertinggi();
                break;
            case 4:
                rataRataNilai();
                break;
            case 5:
                System.out.println("Program selesai. Terima kasih!");
                scanner.close();
                return;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
