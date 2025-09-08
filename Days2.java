package Steven; // Mendefinisikan package bernama Steven

public class Steven { // Main Class bernama Steven

   public static void main(String[] args) { // Method main
 
       // Deklarasi variabel
       String nama = "Steven Ariel Marsandi"; // Menyimpan nama (tipe data String)
       int umur = 18;                         // Menyimpan umur (tipe data integer)
       double tinggi = 159.0;                 // Menyimpan tinggi (tipe data double)
    
       // Mencetak teks "World Hello" lalu otomatis pindah ke baris baru
       System.out.println("World Hello");

       // Mencetak teks "Hello World" tanpa pindah baris
       System.out.print("Hello World");

       // Mencetak teks dengan format:
       // %s = string (nama), %d = integer (umur), %.2f = double dengan 2 angka di belakang koma (tinggi)
       System.out.printf("nama saya %s, umur saya %d tahun, tinggi saya : %.2f", nama, umur, tinggi);
       // Output akhir: nama saya Steven Ariel Marsandi, umur saya 18 tahun, tinggi saya : 159.00
   }
}
