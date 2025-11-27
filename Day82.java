import java.util.Scanner;

public class Stevenn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Isi: ");
        int isi = input.nextInt();
     int[] data = new int[isi];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            data[i] = input.nextInt();
        }

        System.out.println("\nIsi seluruh elemen array:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] = " + data[i]);
        }
    }
}
