package Inheritance;
// import java.util.*;

// class GoldStall extends SilverStall{
//     Integer tvSet;
        
//     public GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet){
//         super(name,detail,owner,cost); 
//         this.tvSet=tvSet;
//         System.out.println(cost+(tvSet*100));
//     }
// }


// class PlatinumStall extends GoldStall{
//     Integer projector;
    
//     public PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector){
//         super(name,detail,owner,cost,tvSet);
//         this.projector=projector;
//         System.out.println(cost+(tvSet*100)+(projector*500));
//     }
// }


// class SilverStall{
//     String name;
//     String detail;
//     String owner;
//     Integer cost;
    
//     public SilverStall(String name, String detail, String owner, Integer cost){
//         this.name=name;
//         this.detail=detail;
//         this.owner=owner;
//         this.cost=cost;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         String name=sc.nextLine();
//         String detail=sc.nextLine();
//         String owner=sc.nextLine();
//         sc.nextLine();
//         Integer cost=sc.nextInt();
//         new SilverStall(name, detail, owner, cost);
//         if(n==1){
//             System.out.println(cost);
//         }
//         else if(n==2){
//             Integer tvSet=sc.nextInt();
//             new GoldStall(name, detail, owner, cost,tvSet);
//         }
//         else if(n==3){
//             Integer tvSet=sc.nextInt();
//             Integer projector=sc.nextInt();
//             new PlatinumStall(name, detail, owner, cost,tvSet,projector);
//         }
//         else{
//             System.out.println("Invalid Input");
//         }
//     }
// }
import java.util.Scanner;

class SilverStall {
    String name;
    String detail;
    String owner;
    Integer cost;
    SilverStall(String name, String detail, String owner, Integer cost){
        this.cost=cost;
        this.detail=detail;
        this.owner=owner;
        this.name=name;
    }
    void display(){
        System.out.print(this.cost);
    }
}
class GoldStall extends SilverStall{
    Integer tvSet;
    GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet){
        super(name,detail,owner,cost);
        this.tvSet=tvSet;
    }
    void display(){
        System.out.print(this.cost+(this.tvSet*100));
    }
}
class PlatinumStall extends GoldStall{
    Integer projector;
    PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector){
        super(name, detail, owner, cost, tvSet);
        this.projector=projector;
    }
    void display(){
        System.out.print(this.cost+(this.tvSet*100)+(this.projector*500));
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n==1){
            sc.nextLine();
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            SilverStall x=new SilverStall(a,b,c,d);
            x.display();
        }
        else if(n==2){
            sc.nextLine();
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            int e=sc.nextInt();
            SilverStall x=new GoldStall(a,b,c,d,e);
            x.display();
        }
        else if(n==3){
            sc.nextLine();
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            int e=sc.nextInt();
            int f=sc.nextInt();
            SilverStall x=new PlatinumStall(a,b,c,d,e,f);
            x.display();
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}