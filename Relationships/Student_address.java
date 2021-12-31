import java.util.Scanner;

class Student{
    private Integer id;
    private String name;
    private String dept;
    private String mobile;
    private Address address;
    
    Student(){}

    Student(Integer id,String name,String dept,String mobile){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.mobile=mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void display(){
        System.out.printf("%d %s %s %s %s %s %s %d",id,name,dept,mobile,address.al1,address.city,address.state,address.pincode);
    }

}

class Address{
    String al1;
    String city;
    String state;
    Integer pincode;

    Address(){}

    Address(String al1,String city,String state,Integer pin){
        this.al1=al1;
        this.city=city;
        this.state=state;
        this.pincode=pin;
    }

    public void setAl1(String al1) {
        this.al1 = al1;
    }

    public String getAl1() {
        return al1;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class Q4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Integer id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String dept=sc.nextLine();
            String mobile=sc.nextLine();
            String al1=sc.nextLine();
            String city=sc.nextLine();
            String state=sc.nextLine();
            Integer pin=sc.nextInt();
            Student x=new Student(id, name, dept, mobile);
            Address a=new Address(al1, city, state, pin);
            x.setAddress(a);
            x.display();
    }
}
