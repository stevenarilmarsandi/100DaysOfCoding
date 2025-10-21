import java.util.Scanner;

public class Sfewgwegewbwe {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    
     System.out.print("Masukkan nilai (0-100): ");
        int nilai = in.nextInt();
        char hasil = 0;

        if (nilai >= 90 && nilai <= 100) {
            hasil = 'A';
        } else if (nilai >= 82) {
            hasil = 'B';
        } else if (nilai >= 70) {
            hasil = 'C';
        } else if (nilai >= 50) {
            hasil = 'D';
        } else if (nilai >= 0) {
            hasil = 'E';
        } else {
            System.out.println("Nilai tidak valid!");

        }

        System.out.println("nilainya adalah: " + hasil);
    }
}

  
