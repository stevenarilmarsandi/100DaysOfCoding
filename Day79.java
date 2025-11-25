import java.util.Scanner;

public class Steven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.print("Buat Username: ");
        String username = input.nextLine();

        System.out.print("Buat Password: ");
        String password = input.nextLine();

        System.out.println("\nAkun berhasil dibuat!");
        System.out.println("=============================\n");

       

        while (true) {
            System.out.print("Masukkan Username: ");
           String userLogin = input.nextLine();

            System.out.print("Masukkan Password: ");
            String passLogin = input.nextLine();

            if (userLogin.equals(username) && passLogin.equals(password)) {
                System.out.println("\nLogin berhasil! " + username + "!");
                break; 
            } else {
                System.out.println("Username atau Password salah.!\n");
            }
        }
    }
}
