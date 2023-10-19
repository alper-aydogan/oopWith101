import java.util.Scanner;

public class Atm {
    public void run(accounts accounts) {
        login login = new login();
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to our bank:");
        System.out.println("********************");
        System.out.println("user login");
        System.out.println("********************");
        int remainig_right_of_entry = 3;
        while (true) {
            if (login.login(accounts)) {
                System.out.println("login sucessful");
                break;
            } else {
                System.out.println("login failed");
                remainig_right_of_entry -= 1;
                System.out.println("remainig_right_of_entry:" + remainig_right_of_entry);
            }
            if (remainig_right_of_entry == 0) {
                System.out.println("Your access rights have expired:");
                return;
            }


        }
        System.out.println("*********************************");
        String islemler = "1.view balance:\n"
                + "2.deposit money:\n"
                + "3.withDraw money\n"
                + "press q for exit";
        System.out.println(islemler);
        System.out.println("**********************************");


        while (true) {
            System.out.println("choose operations : ");
            String islem = scan.nextLine();

            if (islem.equals("q")){

                break;

            }
            else if (islem.equals("1")){
                System.out.println("new balance : " + accounts.getBalance());
            }
            else if (islem.equals("2")){

                System.out.print("The amount you want to deposit: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                accounts.depositMOney(tutar);

            }
            else if (islem.equals("3")) {

                System.out.print("The amount you want to withdraw: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                accounts.withDraw(tutar);

            }
            else {

                System.out.println("Invalid Transaction....");
            }



        }

    }


    }











