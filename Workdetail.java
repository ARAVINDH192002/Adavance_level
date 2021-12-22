package Inheritance;
import java.util.Scanner;

class WorkerDetail {
    int ec;
    int bs;
    String name;

    public void display() {
        System.out.println("Code :" + ec);
        System.out.println("Name : " + name);
        System.out.println("Salary " + bs);
    }

    public double calHRA(double n) {
        return (n * 0.60);
    }
}

class officerSal extends WorkerDetail {
    public double calDA(int n) {
        return (n * 0.98);
    }
}

class ManagerSal extends officerSal {
    public double cityAllowence(int n) {
        return (n * 0.20);
    }

    public double GrossSal() {
        return (this.bs + calHRA(this.bs) + calDA(this.bs) + cityAllowence(this.bs));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int s = sc.nextInt();
        ManagerSal x = new ManagerSal();
        x.bs = s;
        x.ec = c;
        x.name = name;
        x.display();
        System.out.println("HRA :" + x.calHRA(s));
        System.out.println("DA :" + x.calDA(s));
        System.out.println("City Allowance :" + x.cityAllowence(s));
        System.out.println("Gross Salary :" + x.GrossSal());

    }
}

 