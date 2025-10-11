import java.util.Scanner;

public class JavaApplication6 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a <  b : " + (a < b));
        System.out.println("a >  b : " + (a > b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));

        System.out.println("(a < b) && (b > 0) : " + ((a < b) && (b > 0)));
        System.out.println("(a > b) || (b > 0) : " + ((a > b) || (b > 0)));
        System.out.println("!(a == b) : " + (!(a == b)));

    }
    
}
