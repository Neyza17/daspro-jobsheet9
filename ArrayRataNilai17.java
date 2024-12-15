import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa]; 
        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Proses nilai: hitung total dan jumlah lulus/tidak lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) { // Mahasiswa lulus
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else { // Mahasiswa tidak lulus
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
        double rataLulus = (jumlahLulus > 0) ? totalLulus / jumlahLulus : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
