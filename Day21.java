package pkg1_steven;

import java.util.Scanner;

public class NewClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        System.out.println("Belum gue tukar: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sudah gue tukar : a = " + a + ", b = " + b);
    }
}
