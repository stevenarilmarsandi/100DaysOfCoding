import java.util.Scanner;

public class Uy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
       System.out.print(" N: ");
        int N = in.nextInt();
        System.out.print(" M: ");
        int M = in.nextInt();
        
        System.out.println("Bilangan kelipatan " + M + " dari 1 sampai " + N + " adalah:");
        
        
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}
