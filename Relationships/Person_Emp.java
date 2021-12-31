import java.util.Scanner;

class Person {
    private String name;
    private String mob;
    private String email;
    private String city;

    Person(String name, String mob, String email, String city) {
        this.name = name;
        this.mob = mob;
        this.email = email;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name + " " + mob + " " + email + " " + city);
    }
}

class Employee extends Person {
    private Integer id;
    private String dept;
    private String sal;

    Employee(String name, String mob, String email, String city, Integer id, String dept, String sal) {
        super(name, mob, email, city);
        this.dept = dept;
        this.id = id;
        this.sal = sal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(id + " " + dept + " " + sal);
    }
}

class Q2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Employee x = new Employee(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
        x.display();
    }
}
