import java.util.Scanner;

class Cons{
    String name;
    String uname;
    String pass;
    String no;
    
    Cons(String name,String uname,String pass,String no){
        this.name=name;
        this.uname=uname;
        this.pass=pass;
        this.no=no;
    }
    
    Cons(){}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cons[] con=new Cons[2];
        for(int i=0;i<2;i++)
        {
            con[i]=new Cons();
            con[i].name=sc.next();
            con[i].uname=sc.next();
            con[i].pass=sc.next();
            con[i].no=sc.next();
            System.out.println();
        }
        if(con[0].no.equals(con[1].no))
            System.out.print("User 1 and User 2 are equal");
        else
            System.out.print("User 1 and User 2 are not equal");
    }
}
