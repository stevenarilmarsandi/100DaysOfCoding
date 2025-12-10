import java.util.Scanner;


public class Steven{
 public static void info(String nama) {
        System.out.println("Nama: " + nama);
      
        
    }
public static void usia(int umur){
      System.out.println("Umur: " + umur);
}
   
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = in.nextInt();
        info(nama);        
        usia(umur);
        
    }
}
