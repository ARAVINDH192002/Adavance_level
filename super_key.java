package Inheritance;
//import java.util.*;
// class Event{
//     String name;
//     String det;
//     String type;
//     String on;
//     public Event(String name, String detail, String type, String on){
//         this.name=name;
//         this.det=detail;
//         this.type=type;
//         this.on=on;
//     }
// }
// class Exhibition extends Event{
//     Integer stall;
//     public Exhibition(String name, String detail, String type, String on, Integer stall){
//         super(name,detail,type,on);
//         this.stall=stall;
//     }
//     void display(){
//         System.out.print(this.name+" "+this.det+" "+this.type+" "+this.on+" "+this.stall);
//     }
// }
// class StageEvent extends Event{
//     Integer seats;
//     public StageEvent(String name, String detail, String type,String on, Integer noos){
//          super(name,detail,type,on);
//         this.seats=noos;
//     }
//     void display(){
//         System.out.print(this.name+" "+this.det+" "+this.type+" "+this.on+" "+this.seats);
//     }

// }   

// class Main{
//     public static void main(String[] arhs){
//         String oo="super()";
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         sc.nextLine();
//         String s=sc.nextLine();
//         String[] arr=s.split(",");
//         if(n==1){
//             Exhibition x=new Exhibition(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4]));
//             x.display();
//         }
//         else if(n==2){
//             StageEvent x=new StageEvent(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4]));
//             x.display();
//         }
//         else{
//             System.out.println("Invalid input");
//         }

//     }
// }
import java.util.*;
class Event{
    String name;
    String det;
    String type;
    String on;
    public Event(String name, String detail, String type, String on){
        this.name=name;
        this.det=detail;
        this.type=type;
        this.on=on;
    }
}
class Exhibition extends Event{
    Integer stall;
    public Exhibition(String name, String detail, String type, String on, Integer stall){
        super(name,detail,type,on);
        this.stall=stall;
    }
    void display(){
        System.out.print(this.name+" "+this.det+" "+this.type+" "+this.on+" "+this.stall);
    }
}
class StageEvent extends Event{
    Integer seats;
    public StageEvent(String name, String detail, String type,String on, Integer noos){
         super(name,detail,type,on);
        this.seats=noos;
    }
    void display(){
        System.out.print(this.name+" "+this.det+" "+this.type+" "+this.on+" "+this.seats);
    }

}   

class Main{
    public static void main(String[] arhs){
        String oo="super()";
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String[] arr=s.split(",");
        if(n==1){
            Exhibition x=new Exhibition(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4]));
            x.display();
        }
        else if(n==2){
            StageEvent x=new StageEvent(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4]));
            x.display();
        }
        else{
            System.out.println("Invalid input");
        }

    }
}