import java.util.Scanner;

class Person{
    private String name;
    private String ph;
    private String city;
    private String email;

    Person(String name,String ph,String city,String email){
        this.name=name;
        this.ph=ph;
        this.city=city;
        this.email=email;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getPh() {
        return ph;
    }
    public void setPh(String ph) {
        this.ph = ph;
    }

    public void display(){
        System.out.println(name+" "+ph+" "+city+" "+email);
    }
}

class Employee{
    private String id;
    private String dept;
    private Integer sal;
    private Person person;

    Employee(String id,String dept,Integer sal,Person p){
        this.id=id;
        this.dept=dept;
        this.sal=sal;
        this.person=p;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getSal() {
        return sal;
    }

    public void showEmployeeHasADetails(){

        System.out.println(person.getName()+" "+person.getPh()+" "+person.getCity()+" "+person.getEmail());
        System.out.println(id+" "+dept+" "+sal);

    }

}

class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        String d=sc.nextLine();
        String e=sc.nextLine();
        String f=sc.nextLine();
        int g=sc.nextInt();
        Person x=new Person(a,b,c,d);
        Employee y = new Employee(e,f,g,x);
        y.showEmployeeHasADetails();
        sc.close();
    }
}
