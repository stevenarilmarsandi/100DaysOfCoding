import java.util.Scanner;


public class Steven{
 public static int ini(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("isi sisi perseginya: ");
        int sisi = in.nextInt();

        int luas = ini(sisi);

        System.out.println("Luas persegi: " + luas);
    }
}
