import java.util.Scanner;

public class Steven{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    
      System.out.print("Masukkan angka: ");
        int angka = in.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Anda memilih angka SATU.");
                break;
            case 2:
                System.out.println("Anda memilih angka DUA.");
                break;
            case 3:
                System.out.println("Anda memilih angka TIGA.");
                break;
            default:
                System.out.println("Angka yang dimasukkan tidak sesuai.");
        }    
}
}
