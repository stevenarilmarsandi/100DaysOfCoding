import java.util.Scanner;

public class heheheheeh{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan N: ");
        int N = input.nextInt();
        
        
        System.out.println("Angka 1 sampai " + N + ":");
        for (int s = 1; s <= N; s++) {
            System.out.print(s + " ");
        }
        
        System.out.println("\n"); 
        
      
        System.out.println("Angka dari " + N + " ke 1:");
        for (int s = N; s >= 1; s--) {
            System.out.print(s + " ");
        }
        
      
    }
}
