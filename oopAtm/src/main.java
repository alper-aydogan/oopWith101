public class main {
    public static void main(String[] args) {
        Atm atm1 = new Atm();
        accounts accounts = new accounts("alper", "1234", 2000);
        atm1.run(accounts);
        System.out.println("exiting the program");

    }

}



