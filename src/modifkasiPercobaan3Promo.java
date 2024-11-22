import java.util.Scanner;

public class modifkasiPercobaan3Promo {
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7;
        } else {
            System.out.println("Kode promo tidak valid.");
        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        System.out.println("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
    }
}
