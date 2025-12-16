import java.util.Scanner;

public class steven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String n = in.nextLine().toLowerCase().replace(" ", "");

        char[] ISC = {'i', 's', 'c'};
        int ini = 0;

        for (int i= 0; i < n.length() && ini < 3; i++) {
            if (n.charAt(i) == ISC[index]) {
                ini++;
            }
        }

        System.out.println(ini == 3 ? "CANTIK" : "TIDAK CANTIK");
    }
}
