import java.util.Scanner;

public class my gue {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    int angka;
    System.out.print("Masukkan angka: ");
        angka = in.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan dari 3 dan 5.");
        } else if (angka % 3 == 0) {
            System.out.println(angka + " adalah kelipatan dari 3");
        } else if (angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan dari 5");
        } else {
            System.out.println(angka + " bukan kelipatan dari 3 maupun 5");
        }

    }
}

  
