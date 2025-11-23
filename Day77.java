public class Steven{
    public static void main(String[] args) {
        String teks = "   Steven Anak Glory   ";

        String a = teks.trim();              
        String b = a.substring(0,6);     
        String c = a.replace("Glory", "Immortal"); 

        System.out.println("Setelah trim   : " + a);
        System.out.println("substring(0,6): " + b);
        System.out.println("replace        : " + c);
    }
    
}
