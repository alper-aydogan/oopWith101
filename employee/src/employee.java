public class employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double bonusMoney;
    double taxMoney;

    double raiseMoneye;

    employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.salary = salary;

    }

    void tax() {
        if (salary < 1000) {
            this.taxMoney = taxMoney;
            System.out.println("verigi miktarı:" + this.taxMoney);
        }
        if (salary >= 1000) {
            this.taxMoney = (int) (salary * 0.03);
            System.out.println("verigi miktarı:" + this.taxMoney);
        }
    }

    void bonus() {
        if (workHours < 40) {
            this.bonusMoney = this.salary;
            System.out.println("bonuslu maaş:" + this.bonusMoney);
        }
        if (workHours > 40) {
            this.bonusMoney = ((this.workHours - 40) * 30);
            System.out.println("bonuslu maaş:" + this.bonusMoney);
        }
    }

    void raiseSalary() {
        if ((2023 - hireYear) > 19) {
            raiseMoneye = (this.salary * 0.15);
            System.out.println("zamlı maaş:" + this.raiseMoneye);
        }
        if ((2023 - hireYear) < 20 && (2023 - hireYear) > 9) {
            raiseMoneye = (this.salary * 0.1);
            System.out.println("zamlı maaş:" + this.raiseMoneye);
        }
        if ((2023 - hireYear) < 10) {
            raiseMoneye = (this.salary * 0.05);
            System.out.println("zamlı maaş:" + this.raiseMoneye);
        }
    }


    void printTOstring() {
        System.out.println("isim:" + this.name);
        System.out.println("maaş:" + this.salary);
        System.out.println("kaç yıldır çalışıyor:" + this.hireYear);
        System.out.println("haftada kaç saat çalışıyor:" + this.workHours);
        double toplamMaaş = (this.bonusMoney + this.salary + this.raiseMoneye) - (this.taxMoney);
        System.out.println("toplam maaş: " + toplamMaaş);
    }


}
