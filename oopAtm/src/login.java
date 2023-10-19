import java.util.Scanner;

public class login {
    public boolean login(accounts accounts) {
        String kullaniciAdi;
        String parola;
        Scanner scan = new Scanner(System.in);
        System.out.print("kulannıcı adı giriniz:");
        kullaniciAdi = scan.nextLine();
        System.out.print("parola giriniz:");
        parola = scan.nextLine();
        if (accounts.name.equals(kullaniciAdi) && accounts.password.equals(parola)) {
            return true;
        } else {
            return false;
        }
    }
}