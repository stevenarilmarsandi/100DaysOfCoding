import java.util.Scanner;

public class Steven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("jumlah elemen array: ");
        int n = input.nextInt();

        int[] data = new int[n];


        for (int i = 0; i < data.length; i++) {
            System.out.print("elemen ke-" + i + ": ");
            data[i] = input.nextInt();
        }

        int maks = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > maks) {
                maks = data[i];
            }
        }

        System.out.println("\nAngka maksimalnya = " + maks);
    }
}
