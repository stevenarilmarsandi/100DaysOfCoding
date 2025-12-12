import java.util.Scanner;


public class Steven{
 public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
      int a = in.nextInt(); 
        System.out.println("Masukkan Angka: ");
      int b = in.nextInt();
           System.out.println("Penjumlahan : " + tambah(a, b));
        System.out.println("Pengurangan : " + kurang(a, b));
        System.out.println("Perkalian   : " + kali(a, b));
        System.out.println("Pembagian   : " + bagi(a, b));
    }
}
