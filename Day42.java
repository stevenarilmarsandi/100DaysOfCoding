import java.util.Scanner;

public class uuu2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.print("Masukkan nama karyawan: ");
        String nama = in.nextLine();

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = in.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = in.nextDouble();

        System.out.print("Masukkan potongan: ");
        double potongan = in.nextDouble();

        double gajiKotor = gajiPokok + tunjangan;
        double gajiBersih = gajiKotor - potongan;

        System.out.printf("\n=== Rincian Gaji Karyawan ===\nNama karyawan: %s\nGaji pokok: Rp%.0f\nTunjangan: Rp%.0f\nPotongan: Rp%.0f\n\nGaji bersih: Rp%.0f\n",nama,gajiPokok,tunjangan,potongan,gajiBersih);
       

    }

}
