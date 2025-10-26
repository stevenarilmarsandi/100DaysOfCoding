import java.util.Scanner;

public class ConstantaFinal {
public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
    System.out.print("Masukkan nilainya: ");
        int nilai = s.nextInt();

        String hasil;
        if (nilai < 0 || nilai > 100) {
            hasil = "tidak mungkin mendapat nilai segitu";
        } else {
        hasil = (nilai >= 77 ) ? "Lulus" : "Tidak Lulus";
        }
        System.out.println("nilainya "+nilai+" dia " + hasil);
    }
}

