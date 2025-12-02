public class Day86 {
    public static void main(String[] args) {
        int[] angka = {5,2,7,6,9};
        int angka2 = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] < angka2) angka2 = angka[i];
            System.out.print(angka[i]+" ");
        }
        System.out.println("angka yang terkecil : "+angka2);
    }
}
