import java.util.Scanner;

class Patient {
    String PID;
    String name;
    String age;
    String gen;
    String add;
    String no;

    Patient(String a, String b, String c, String d, String e, String f) {
        this.PID = a;
        this.name = b;
        this.age = c;
        this.gen = d;
        this.add = e;
        this.no = f;
    }

    void displayData() {

    }
}

class In_Patient extends Patient {
    String rno;
    double cf;
    double tf;
    String doa;
    String dod;
    int nod;
    double rr;

    In_Patient(String a, String b, String c, String d, String e, String f, String g, double h, double i, String j,
            String k, int l, double m) {
        super(a, b, c, d, e, f);
        this.rno = g;
        this.cf = h;
        this.tf = i;
        this.doa = j;
        this.dod = k;
        this.nod = l;
        this.rr = m;
    }

    @Override
    void displayData() {
        super.displayData();
    }
}

class Bill extends In_Patient {
    String dob;

    Bill(String a, String b, String c, String d, String e, String f, String g, double h, double i, String j, String k,
            int l, double m, String n) {
        super(a, b, c, d, e, f, g, h, i, j, k, l, m);
        this.dob = n;
    }

    @Override
    void displayData() {
        super.displayData();
        System.out.println("PID: " + PID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gen);
        System.out.println("Address: " + add);
        System.out.println("Mobile Number: " + no);
        System.out.println("Room Number: " + rno);
        System.out.println("Consultation Fee: " + cf);
        System.out.println("Test Fee: " + tf);
        System.out.println("DOA: " + doa);
        System.out.println("Discharge Date: " + dod);
        System.out.println("Number of Days: " + nod);
        System.out.println("Room Rent: " + rr);
        System.out.println("Date of bill: " + dob);
    }

    void calBill() {
        double bill = rr * nod;
        bill += (cf + tf);
        System.out.println("Total amount: " + bill);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();
        String e = sc.nextLine();
        String f = sc.nextLine();
        String g = sc.nextLine();
        Double h = Double.parseDouble(sc.nextLine());
        Double i = Double.parseDouble(sc.nextLine());
        String j = sc.nextLine();
        String k = sc.nextLine();
        Integer l = Integer.parseInt(sc.nextLine());
        Double m = Double.parseDouble(sc.nextLine());
        String n = sc.nextLine();
        Bill bill = new Bill(a, b, c, d, e, f, g, h, i, j, k, l, m, n);
        bill.displayData();
        bill.calBill();
    }
}

 
