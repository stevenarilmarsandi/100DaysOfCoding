import java.util.Scanner;

public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode kunci pertama: ");
        int kode1 = input.nextInt();

        System.out.print("Masukkan kode kunci kedua: ");
        int kode2 = input.nextInt();

        boolean pintuTerbuka = (kode1 == 1234) || (kode2 == 5678);

        System.out.println("Apakah pintu terbuka? " + pintuTerbuka);
    }
}
