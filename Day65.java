package steven;

import java.util.Scanner;

public class Steven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = 1;

        System.out.print("isi: ");
       int  s = in.nextInt();

        for (int i = 1; i <= s; i++) {
            f = f * i; 
        }

        System.out.printf("Faktorial dari %d adalah %d\n",s,f);
    }
}
