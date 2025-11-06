import java.util.Scanner;

public class Steven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = in.nextInt();

        System.out.println("\nAngka Ganjil dari " + n + " hingga " + "1" + ":");
        for (int angka = n; angka >= 1; angka--) {
            if (angka % 2 == 1) {
                System.out.print(angka + " ");
            }
        }

        System.out.println("\n\nAngka Genap dari " + n + " hingga " + "1" + ":");
        for (int angka = n; angka >= 1; angka--) {
            if (angka % 2 == 0) {
                System.out.print(angka + " ");
            }
        }

        System.out.println("\n");
    }
}
