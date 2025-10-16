package king;
import java.util.Scanner;
public class King {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("======= MENU =======");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Ayam Bakar");
        System.out.print("Masukkan pilihan Anda (1-3): ");
        double pilihan = u.nextDouble();
        
        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng. Harganya: Rp 20.000");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Goreng. Harganya: Rp 18.000");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Ayam Bakar. Harganya: Rp 25.000");
        } else {
            System.out.println("Menu Tidak Ada.");
        }
        }
    }
    

