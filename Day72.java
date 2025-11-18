import java.util.Scanner;

public class steven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" ");
        int kosong = s.nextInt();
        
        for (int i = kosong; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(".");
            }
            System.out.println("");
        }
