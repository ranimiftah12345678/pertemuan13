import java.util.Scanner;
public class modifikasiPercobaan3Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int[] jumlahItems = new int[hargaItems.length];
        int totalHarga = 0;

        char lanjut = 'y';
        while (lanjut == 'y' || lanjut == 'Y') {
            System.out.println("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt() - 1;
            System.out.println("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            jumlahItems[pilihanMenu] += banyakItem;

            System.out.println("Apakah Anda ingin memesan menu lain? (y/n)");
            lanjut = sc.next().charAt(0);
        }

        for (int i = 0; i < hargaItems.length; i++) {
            totalHarga += hargaItems[i] * jumlahItems[i];
        }

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
    }
}
