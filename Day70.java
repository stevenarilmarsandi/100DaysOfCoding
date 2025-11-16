import java.util.Scanner;

public class Steven{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
   System.out.print("Masukkan l: ");
        int l = s.nextInt();

        System.out.print("Masukkan p: ");
        int p = s.nextInt();

        for(int i = 1; i <= l; i++){
            for(int j = 1; j <= p; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
     

