import java.util.Scanner;

public class Steve{
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Masukkan angka:");
              int gue = s.nextInt();
      String hasil = (gue % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + gue + " adalah bilangan " + hasil);
   
       
    }
    
}
