import java.util.Scanner;

public class Steven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     int[] nilai = {90, 85, 75, 80, 95};
     
        System.out.print("Masukkan indeks : ");
        int i = input.nextInt();

        System.out.println("Nilai pada indeks " + i + " = " + nilai[i]);
    }
}
