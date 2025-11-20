import java.util.Scanner;

public class Steven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pilihan;
        do{
        System.out.println("1.persegi");
        System.out.println("2.Lingkaran");
        System.out.println("3.Persegi Panjang");
        System.out.print("Masukkan Pilihan: ");
        pilihan = s.nextInt();
        switch(pilihan){
            case 1: 
                System.out.print("Sisi: ");
                int sisi = s.nextInt();
                
                int hasil = sisi*sisi;
                System.out.println("Hasil: "+ hasil);
                break;
            case 2 :
                System.out.print("R : ");
                double r = s.nextDouble();
                
                 final double hasi = 3.14*r*r;
                 System.out.println("Hasil: "+ hasi);
                 break;
                 
            case 3 : 
                System.out.print("p: ");
                int p = s.nextInt();
                System.out.print("l: ");
                int l = s.nextInt();
                
                int Luas = p*l;
                
                System.out.println("Hasil: "+ Luas);
                break;
                
            default:
                System.out.println("Salah");
        }
            System.out.println("");
            } while (pilihan <= 0&&pilihan > 3);
    }
    
}
