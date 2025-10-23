import java.util.Scanner;

public class Steven{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;

        System.out.println("=== MENU MAKANAN & MINUMAN ===");
        System.out.println("1. Nasi Goreng   - Rp15.000");
        System.out.println("2. Mie Goreng    - Rp12.000");
        System.out.println("3. Ayam Geprek   - Rp18.000");
        System.out.println("4. Sate Ayam     - Rp20.000");
        System.out.println("5. Es Teh Manis  - Rp5.000");
        System.out.println("6. Es Jeruk      - Rp6.000");
        System.out.println("7. Kopi Panas    - Rp8.000");
        System.out.println("8. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng.");
                System.out.println("Total bayar: Rp15.000");
                System.out.println("Terima kasih telah berkunjung!");

                break;
            case 2:
                System.out.println("Anda memilih Mie Goreng.");
                System.out.println("Total bayar: Rp12.000");
                System.out.println("Terima kasih telah berkunjung!");
                break;
            case 3:
                System.out.println("Anda memilih Ayam Geprek.");
                System.out.println("Total bayar: Rp18.000");
                System.out.println("Terima kasih telah berkunjung!");
                break;
            case 4:
                System.out.println("Anda memilih Sate Ayam.");
                System.out.println("Total bayar: Rp20.000");
                System.out.println("Terima kasih telah berkunjung!");
                break;
            case 5:
                System.out.println("Anda memilih Es Teh Manis.");
                System.out.println("Total bayar: Rp5.000");
                System.out.println("Terima kasih telah berkunjung!");
                break;
            case 6:
                System.out.println("Anda memilih Es Jeruk.");
                System.out.println("Total bayar: Rp6.000");
                System.out.println("Terima kasih telah berkunjung!");
                break;
            case 7:
                System.out.println("Anda memilih Kopi Panas.");
                System.out.println("Total bayar: Rp8.000");
                System.out.println("Terima kasih telah berkunjung!");
                break;
            case 8:
                System.out.println("Terima kasih telah berkunjung!");
                break;
            default:
                System.out.println("Pilihan tidak ada dimenu.");
        }

    }
}
