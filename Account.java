package Inheritance;
import java.util.*;

class Account {
    public final String accName;
    public final String accNo;
    public final String bankName;

    public Account(String accName, String accNo, String bankName) {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
    }
}

class CurrentAccount extends Account {
    public final int tinNumber;

    public CurrentAccount(String accName, String accNo, String bankName, int tinNumber) {
        super(accName, accNo, bankName);
        this.tinNumber = tinNumber;
    }

    public void display() {
        System.out.println(accName + "\n" + accNo + "\n" + bankName + "\n" + tinNumber);
    }
}

class SavingAccount extends Account {
    public String orgName;

    SavingAccount(String accName, String accNo, String bankName, String orgName) {
        super(accName, accNo, bankName);
        this.orgName = orgName;
    }

    public void display() {
        System.out.println(accName + "\n" + accNo + "\n" + bankName + "\n" + orgName);
    }
}

class BankAcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        sc.nextLine();
        String name = sc.next();
        String accNo = sc.next();
        String bankName = sc.next();
        if (n == 1) {
            String orgName = sc.next();
            SavingAccount user = new SavingAccount(name, accNo, bankName, orgName);
            user.display();
        }
        if (n == 2) {
            int tinNumber = sc.nextInt();
            CurrentAccount user = new CurrentAccount(name, accNo, bankName, tinNumber);
            user.display();
        }
        String x = "Account";
        String xx = "SavingsAccount";
        String xxx = "CurrentAccount";
        String xxxx = "display()";
    }
}
