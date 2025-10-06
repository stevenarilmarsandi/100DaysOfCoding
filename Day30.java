public class NewClass1{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 5;
      
      // Operator <=
        System.out.println("a <= b : " + (a <= b));   // true
        System.out.println("b <= a: " + (b <= a));   // true
        System.out.println("b <= c: " + (b <= c));   // false

        // Operator >=
        System.out.println("b >= a: " + (b >= a));   // true
        System.out.println("c >= a: " + (c >= a));   // false
        System.out.println("a >= b: " + (a >= b));   // true
    }
}

    
