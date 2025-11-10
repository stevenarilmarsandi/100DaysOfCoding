import java.util.Scanner;

public class stveen {
public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

        System.out.print(" M: ");
        int M = s.nextInt();
        System.out.print("N: ");
        int N = s.nextInt();
        
        int ini = 1;
        
        for (int i = 1; i <= N; i++) {
            ini *= M;
        }
        
        System.out.println(M + " pangkat " + N + " = " + ini);
        
        
    }
}
    
