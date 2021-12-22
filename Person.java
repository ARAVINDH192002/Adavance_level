package Inheritance;
import java.util.*;

class Person{
    String name;
    int by;
    Person(String name,int birthYear){
        this.name=name;
        this.by=birthYear;
    }
}

class Student extends Person{
    String dept;
    int ap;
    Student(String name,int by,String d,int ap){
        super(name,by);
        this.dept=d;
        this.ap=ap;
    }
    public String isEligible(int ap){
        if(this.ap>75){
            return "Yes";
        }
        return "No";
    }
    @Override
    public String toString(){
        System.out.println("Name : "+this.name);
        System.out.println("BirthYear : "+this.by);
        System.out.println("Department : "+this.dept);
        System.out.println("Eligible : "+isEligible(this.ap));
        return "o";
    }
}

class Staff extends Person{
    int sal;
    Staff(String name,int by,int sal){
        super(name,by);
        this.sal=sal;
    }
}

class TeachingStaff extends Staff{
    String sub;
    int res;
    TeachingStaff(String name,int by,String sub,int res,int sal){
        super(name,by,sal);
        this.sub=sub;
        this.res=res;
    }
    public double newSal1(){
        double d=this.res/10;
        double dd=this.sal*(d/100);
        return (this.sal+dd);
    }
    @Override
    public String toString(){
        System.out.println("Name : "+this.name);
        System.out.println("BirthYear : "+this.by);
        System.out.printf("Old Salary : %.1f%n",(double)this.sal);
        System.out.println("Subject : "+this.sub);
        System.out.printf("New Salary : %.1f",newSal1());
        return "o";
    }
}

class NonTeachingStaff extends Staff{
    String lab;
    int exp;
    NonTeachingStaff(String name,int by,String lab,int exp,int sal){
        super(name,by,sal);
        this.lab=lab;
        this.exp=exp;
    }
    public double newSal(){
       double d=((double)this.exp)/100.0;
       return (this.sal+(this.sal)*d);
    }
    @Override
    public String toString(){
        System.out.println("Name : "+this.name);
        System.out.println("BirthYear : "+this.by);
        System.out.printf("Old Salary : %.1f%n",(double)this.sal);
        System.out.println("Lab : "+this.lab);
        System.out.printf("New Salary : %.1f",newSal());
        return "o";
    }

    
}


class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a=sc.nextLine();
        int b=sc.nextInt();
        if(n==1){
            sc.nextLine();
            String dept=sc.nextLine();
            int ap=sc.nextInt();
            Student x=new Student(a,b,dept,ap);
            x.toString();
        }
        else if(n==2){
            sc.nextLine();
            String c=sc.nextLine();
            int res=sc.nextInt();
            int sal=sc.nextInt();
            TeachingStaff x=new TeachingStaff(a,b,c,res,sal);
            x.toString();
        }
        else if(n==3){
            sc.nextLine();
            String lab=sc.nextLine();
            int exp=sc.nextInt();
            int sal=sc.nextInt();
            NonTeachingStaff x=new NonTeachingStaff(a,b,lab,exp,sal);
            x.toString();

        }
        sc.close();
    }
}
