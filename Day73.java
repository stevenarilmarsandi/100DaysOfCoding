import java.util.Scanner;

public class Steven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
   double total = 0;
        int jumlah = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        while (true) {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            double angka = s.nextDouble();

            if (angka < 0) {
                break;
            }

            if (angka == 0) {
                System.out.println("Angka 0 diabaikan.");
                continue;
            }

            total += angka;
            jumlah++;

            if (angka > max) max = angka;
            if (angka < min) min = angka;
        }

        System.out.println("===== HASIL =====");

        if (jumlah == 0) {
            System.out.println("Tidak ada data untuk dihitung.");
        } else {
            double rata = total / jumlah;

            System.out.println("Total penjumlahan : " + total);
            System.out.println("Jumlah angka valid: " + jumlah);
            System.out.println("Rata-rata : " + rata);
            System.out.println("Angka maksimum  : " + max);
            System.out.println("Angka minimum  : " + min);
        }
    }
}
     

