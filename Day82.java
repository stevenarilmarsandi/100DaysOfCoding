import java.util.Scanner;

public class Steven{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Isi: ");
        int isi = input.nextInt();
     int[] data = new int[isi];
 int total = 0;
        int Nol = 0;

       
        for (int i = 0; i < data.length; i++) {
            System.out.print("elemen ke-" + i + ": ");
            int nilai = input.nextInt();
            
            if (nilai < 0) {
                data[i] = 0;
            } else {
                data[i] = nilai;
            }
        }

        System.out.println("\nIsi elemen array:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] = " + data[i]);
        }

       
        for (int i = 0; i < data.length; i++) {
            total += data[i];
            if (data[i] == 0) {
                Nol++;
            }
        }

        double rataRata = (double) total / data.length;

   
        System.out.println("\nTotal array = " + total);
        System.out.println("Rata-rata = " + rataRata);
        System.out.println("Jumlah elemen 0 = " + Nol);
    }
}
