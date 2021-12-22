package Inheritance;
import java.util.*;
class work {
    static void name(String a){
        System.out.println("Name: "+a);
    }
    static void id(int b){
        System.out.println("Staff id: "+b);
    }
    static void days(int c){
        System.out.println("Days: "+c);
    }
    static void hour(int d){
        System.out.println("Hour: "+d);
    }
    static void salary(int c,int d){
        System.out.println("Salary: "+(c*d*50));
    }
}

public class emp extends work {
    String a;
    int b;
    int c;
    int d;
    public emp(String a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        emp s=new emp( a, b, c, d);
        name(a);
        id(b);
        days(c);
        hour(d);
        salary(c,d);
    }
}