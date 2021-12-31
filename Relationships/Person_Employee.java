import java.util.Scanner;

class Person {
    private String name;
    private String mobile;
    private String city;
    private String email;

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
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Person(String name,String mobile,String city,String email){
        this.name=name;
        this.mobile=mobile;
        this.city=city;
        this.email=email;
    }
    public void display(){
        System.out.println(name+" "+mobile+" "+city+" "+email);
    }
}
class Employee{
    private String id;
    private String dept;
    private Integer salary;
    private Person person;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public Employee(String id,String dept,Integer salary){
        this.id=id;
        this.dept=dept;
        this.salary=salary;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public Person getPerson() {
        return person;
    }
    void display(){
        person.display();
        System.out.println(id+" "+dept+" "+salary);
    }

}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String x="Person[]";
        String y="showEmployeeHasADetails()";
        Employee[] arr=new Employee[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
          String a=sc.nextLine();
          String b=sc.nextLine();
          String c=sc.nextLine();
          String d=sc.nextLine();
          String e=sc.nextLine();
          String f=sc.nextLine();
          Integer g=Integer.parseInt(sc.nextLine());
          arr[i]=new Employee(e,f,g);
          Person tp=new Person(a,b,c,d);
          arr[i].setPerson(tp);
          arr[i].display();        
        }


    }
}


 
