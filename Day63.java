import java.util.Scanner;

public class Steven {
public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
       System.out.print("Masukkan N: ");
        int N = s.nextInt();
        
        int jumlah = 1;
        
        for (int angka = 1; angka <= N; angka++) {
            jumlah *= angka;
        }
        
        System.out.println("Hasil dari 1 sampai " + N + " adalah: " + jumlah);
        
    }
}
    
