import java.util.Scanner;

public class Steven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan elemen: ");
        int n = input.nextInt();

        int[] data = new int[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            data[i] = input.nextInt();
        }

        System.out.print("angka yang ingin dicaro#i: ");
        int m = input.nextInt();

        boolean r = false;

        // proses pencarian
        for (int i = 0; i < n; i++) {
            if (data[i] == m) {
                System.out.println("Angkanya ada: " + i);
                r = true;
                break;
            }
        }

        if (!r) {
            System.out.println("Angka tidak ada.");
        }
    }
}
