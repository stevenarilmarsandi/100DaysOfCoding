import java.util.Scanner;

public class Steven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = input.nextInt();
        int[] nilai = new int[n];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println("\nData Array:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Index " + i + " = " + nilai[i]);
        }

    }
}
