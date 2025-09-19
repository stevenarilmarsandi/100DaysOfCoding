package Steven;
import java.util.Scanner;
public class Steven {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Nama Lengkap: ");
        String nama = i.nextLine();
        System.out.print("Alamat: ");
        String alamat = i.nextLine();
        System.out.print("Tempat Lahir: ");
        String tempat = i.nextLine();
        System.out.print("Tanggal Lahir: ");
        String tanggal = i.nextLine();
        System.out.print("No. Handphone: ");
        String nomor = i.nextLine();
        
        System.out.println("===================================================================");
        
        System.out.println("Nama Lengkap\t\t: "+ nama);
        System.out.println("Alamat\t\t\t: "+ alamat);
        System.out.println("Tempat,Tanggal Lahir\t: "+ tempat + "," + tanggal);
        System.out.println("No. HP\t\t\t: "+ nomor);
    }
}
