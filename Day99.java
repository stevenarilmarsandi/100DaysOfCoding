import java.util.Scanner;

public class Steven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = in.nextInt();

        System.out.println("Bilangan prima dari 1 sampai dengan " + n + ":");

        for (int i = 2; i <= n; i++) {
            int ini = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) ini++;
            }

            if (ini == 2) {
                if (i == 19) {
                    System.out.println(i); 
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
