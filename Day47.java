import java.util.Scanner;

public class Sfewgwegewbwe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Hari Senin.");
                break;
            case 2:
                System.out.println("Hari Selasa.");
                break;
            case 3:
                System.out.println("Hari  Rabu.");
                break;
            case 4:
                System.out.println("Hari  Kamis.");
                break;
            case 5:
                System.out.println("Hari Jumat.");
                break;
            case 6:
                System.out.println("Hari  Sabtu.");
                break;
            case 7:
                System.out.println("Hari Minggu.");
                break;
            default:
                System.out.println("Angka yang dimasukkan tidak cocok.");
        }
    }
}
