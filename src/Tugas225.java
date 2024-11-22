import java.util.Scanner;

public class Tugas225 {
    private static final String[] menu = {"Kopi", "Teh", "Es Degan", 
"Roti Bakar", "Gorengan"};
    private static final int[][] penjualan = new int[5][7]; 

    public static void inputPenjualan() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu: " 
+ menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Data penjualan berhasil dimasukkan!\n");
    }
    public static void tampilkanPenjualan() {
        System.out.println("Rekap Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void menuPenjualanTertinggi() {
        int maxPenjualan = 0;
        String menuTertinggi = "";
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah " + 
menuTertinggi + " dengan total penjualan: " + maxPenjualan + "\n");
    }

    public static void rataRataPenjualan() {
        System.out.println("Rata-rata penjualan untuk setiap menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / 7;
            System.out.println(menu[i] + ": " + rataRata);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Menu Rekap Penjualan ===");
            System.out.println("1. Input data penjualan");
            System.out.println("2. Tampilkan seluruh data penjualan");
            System.out.println("3. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("4. Tampilkan rata-rata penjualan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    inputPenjualan();
                    break;
                case 2:
                    tampilkanPenjualan();
                    break;
                case 3:
                    menuPenjualanTertinggi();
                    break;
                case 4:
                    rataRataPenjualan();
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