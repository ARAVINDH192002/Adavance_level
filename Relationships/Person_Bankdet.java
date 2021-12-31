import java.util.Scanner;

class Employee{
    String name;
    String emp_id;
    String dept;
    Integer sal;
    Bank_details bank_det;
    Employee(String name,String emp_id,String dept,Integer sal){
        this.name=name;
        this.emp_id=emp_id;
        this.dept=dept;
        this.sal=sal;
    }
    public String toString(){
        System.out.println(name+" "+emp_id+" "+dept+" "+sal+" "+bank_det.bank_Name+" "+bank_det.acc_no+" "+bank_det.branch);
        return "s";
    }
}

class Bank_details{
    String bank_Name;
    String acc_no;
    String branch;
    Employee employee;
    Bank_details(String bank_name,String acc_no,String branch){
        this.acc_no=acc_no;
        this.bank_Name=bank_name;
        this.branch=branch;
    }
}

class Q1{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Employee arr[]=new Employee[n];
        for(int i=0;i<n;i++){
        arr[i]=new Employee(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
        sc.nextLine();
        arr[i].bank_det=new Bank_details(sc.nextLine(),sc.nextLine(),sc.nextLine());
        arr[i].toString();
        }
        String search=sc.nextLine();
        for(int i=0;i<n;i++){
            if(arr[i].emp_id.equals(search)){
                arr[i].toString();return;
            }
        }
        System.out.printf("No contact with Employee id %s found",search);
   } 
}
