import java.util.Scanner;

public class Kalkulator2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil;
        System.out.println("=== KALKULATOR gyue ===");
        System.out.print(" angka pertama: ");
       double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
      char operator = input.next().charAt(0);

        System.out.print("angka kedua: ");
        double angka2 = input.nextDouble();

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Pembagian dengan nol tidak bisa");
            }
        } else if (operator == '%') {
            if (angka2 != 0) {
                hasil = angka1 % angka2;
                System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Modulus dengan nol tidak bisa");
            }
        } else {
            System.out.println("Operator Salah");
        }
    }
}
