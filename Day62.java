import java.util.Scanner;

public class Uy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
     System.out.print("Masukkan N: ");
        int N = in.nextInt();
        
        int jumlah = 0;
        
        for (int angka = 1; angka <= N; angka++) {
            jumlah += angka;
        }
        
        System.out.println("Hasil dari 1 sampai " + N + " adalah: " + jumlah);
        
    }
}
