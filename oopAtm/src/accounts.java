public class accounts {
    String name;
    String password;
    int balance;

    accounts(String name, String password, int balance) {
        this.balance = balance;
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withDraw(int tutar) {
        if (tutar > balance) {
            System.out.println("there is not enough money");
        } else if (tutar <= balance) {
           this.balance -= tutar;
            System.out.println(this.balance);
        }
    }

    public void depositMOney(int tutar) {
        this.balance += tutar;
        System.out.println(this.balance);
    }
}
