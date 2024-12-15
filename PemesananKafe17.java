import java.util.Scanner;

public class PemesananKafe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Ice Cream", "Pop Ice", "Kentang Goreng", "Jus Jeruk", "Nasi Karage"};
        int[] harga = {5000, 3000, 10000, 6000, 15000};

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();  

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        double totalBiaya = 0;  

        System.out.println("\nMenu yang tersedia:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("\nMasukkan nomor pesanan ke-" + (i + 1) + " (1-5): ");
            int pilihan = sc.nextInt();
            sc.nextLine();  

            if (pilihan < 1 || pilihan > menu.length) {
                System.out.println("Pilihan tidak valid. Silakan pilih antara 1 sampai 5.");
                i--;
                continue;
            }
            namaPesanan[i] = menu[pilihan - 1];
            hargaPesanan[i] = harga[pilihan - 1];

            totalBiaya += hargaPesanan[i];  
        }
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("\nTotal Biaya Pesanan: Rp " + totalBiaya);
    }
}
