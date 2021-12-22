package Inheritance;

import java.util.*;

class Event {
    String name;
    String detail;
    String type;
    String owner;
    Double cost; 
    String start;
    String end;

    public Event(String name,String detail,String type,String owner,Double cost,String s,String e){
          this.name=name;
          this.detail=detail;
          this.type=type;
          this.owner=owner;
          this.cost=cost;
          this.start=s;
          this.end=e;
    }
}
class Exhibition extends Event{
     Integer noOfStall;
     public Exhibition(String name, String detail, String type, String owner,Double cost,Integer noOfStall,String s,String e){
        super(name,detail,type,owner,cost,s,e);
        this.noOfStall=noOfStall;
    }
    int nood(){
        int a=Integer.parseInt(this.start.substring(0,2));
        int b=Integer.parseInt(this.end.substring(0,2));
        return (int)Math.abs(a-b);
    }
    void Display(){
        System.out.println(this.cost*0.05*nood());
    }
}
class StageEvents extends Event{
    Integer noOfSets;
    public StageEvents(String name, String detail, String type,String owner,Double cost, Integer noOfSets,String s,String e){
        super(name,detail,type,owner,cost,s,e);
       this.noOfSets=noOfSets;
   }
   int nood(){
    int a=Integer.parseInt(this.start.substring(0,2));
    int b=Integer.parseInt(this.end.substring(0,2));
    return (int)Math.abs(a-b);
}
   void Display(){
    System.out.println(this.cost*0.15*nood());
  }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        if(n==1){
            String name=sc.nextLine();
            String detail=sc.nextLine();
            String type=sc.nextLine();
            String owner=sc.nextLine();
            Double cost=sc.nextDouble();
            Integer noOfStall=sc.nextInt();
            sc.nextLine();
            String start=sc.nextLine();
            String end=sc.nextLine();
            Exhibition x=new Exhibition(name, detail, type, owner, cost, noOfStall,start,end);
            x.Display();
        }
        else{
            String name=sc.nextLine();
            String detail=sc.nextLine();
            String type=sc.nextLine();
            String owner=sc.nextLine();
            Double cost=sc.nextDouble();
            Integer noOfSets=sc.nextInt();
            sc.nextLine();
            String start=sc.nextLine();
            String end=sc.nextLine();
            StageEvents x=new StageEvents(name, detail, type, owner, cost, noOfSets,start,end);
            x.Display();
        }
    }
}