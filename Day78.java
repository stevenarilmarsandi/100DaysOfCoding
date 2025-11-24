public class Steven{

    public static void main(String[] args) {
        String nama = "Steven";
        String role = "Jungler";
        String role2 = "jungler";
        String kalimat = "Epic itu poke";
        String isi = "";

        System.out.println("Panjang karakter: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());
        System.out.println("Apakah sama apakah String role huruf kecil semua? " + role.equals(role2));
        System.out.println("Apakah sama apakah String role2 huruf kecil semua? " + role.equalsIgnoreCase(role2));
        System.out.println("Apakah kalimat mengandung 'Epic'? " + kalimat.contains("Epic"));
        System.out.println("Apakah kalimat mengandung 'poke'? " + kalimat.contains("poke"));
        System.out.println("Apakah isi kosong? " + isi.isEmpty());
    }
}
