import java.util.Scanner;

public class PenjualanTiketBioskop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahTiket, totalTiketTerjual = 0;
        int hargaTiket = 50000;
        int totalPendapatan = 0;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif. Silakan masukkan lagi.");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }

            int subtotal = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0.0;
            }
            
            int totalBayar = subtotal - (int)(subtotal * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalBayar;

            System.out.println("Diskon yang didapat: " + (diskon * 100) + "%");
            System.out.println("Total harga yang harus dibayar : Rp " + totalBayar);

        } while (true);

        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);

        sc.close();
    }
}