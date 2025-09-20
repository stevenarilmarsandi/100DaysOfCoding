
package pkg1_steven;

public class NewClass1 {
    public static void main(String[] args) {
       

        char a = '&';
        char b = '$';
        char c = '@';
        char d;

        System.out.println("sebelum ditukar: ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        d = a;
        a = b;
        b = d;
        System.out.println("setelah ditukar:");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
    
    }
}

    

