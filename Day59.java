import java.util.Scanner;
public class Uy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          System.out.print("Masukkan N: ");
        int n = in.nextInt();

        System.out.println("\nAngka Ganjil dari 1 hingga " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nAngka Genap dari 1 hingga " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
              
            }

        }
          System.out.println("\n");
    }

}
