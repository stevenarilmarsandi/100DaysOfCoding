public class Steven {
    public static void main(String[] args) {
         String hehe = "Java";
        String huhu = "java";
        String ini = "Belajar Java";
        String kosong = "tidak";

        System.out.println(hehe.equals(huhu));
        System.out.println(hehe.equalsIgnoreCase(huhu));
        System.out.println(ini.contains("Java"));
        System.out.println(kosong.isEmpty());
    }
    
}
