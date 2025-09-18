
package pkg1_steven;

import java.util.Scanner;

public class jagatcoding_09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l, n, m;
        System.out.print("masukkan l = ");
        l = input.nextInt();
        System.out.print("masukkan n = ");
        n = input.nextInt();
        m = l + n;
        System.out.print(l + "+" + n + " = ");
        System.out.println(m);
        m = n - l;
        System.out.println(n + " - " + l + " = " + m);
        m = l * n;
        System.out.println(l + " x " + n + " = " + m);
        m = l / n;
        System.out.println(l + " : " + n + " = " + m);
        
        m = l % n;
        System.out.println(l + " % " + n + " = " + m);
        
    }
}
