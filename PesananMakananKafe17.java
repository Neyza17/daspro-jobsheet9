import java.util.Scanner;

public class PesananMakananKafe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"
        };
        System.out.println("Daftar Menu Makanan di Kafe:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.print("\nMasukkan nama makanan yang ingin Anda cari: ");
        String makananDicari = sc.nextLine();

        boolean ditemukan = false; 

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("\nMakanan '" + makananDicari + "' tersedia di menu.");
        } else {
            System.out.println("\nMakanan '" + makananDicari + "' tidak tersedia di menu.");
        }
    }
}
