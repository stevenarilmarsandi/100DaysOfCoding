import java.util.Scanner;

public class JavaApplication24 {
public static void main(String[] args) {
       Scanner nah = new Scanner(System.in);
      
       System.out.print("nilai : ");
       int nilai = nah.nextInt();
       
       if (nilai < 10  ){
           System.out.println("satuan");
       }else if (nilai < 100){
           System.out.println("puluhan");
       }else{
           System.out.println("Diatas Puluhan");
           

       }
    }
    
}
