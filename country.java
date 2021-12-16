import java.util.Scanner;

class Solution{
    String name;
    String code;
    String isd;
    
    Solution(String name,String code,String isd){
        this.name=name;
        this.code=code;
        this.isd=isd;
    }
    
    void display(){
        System.out.println("Country Name : "+name);
        System.out.println("Country Code : "+code);
        System.out.print("ISD Code : "+isd);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution con=new Solution(sc.nextLine(),sc.nextLine(),sc.nextLine());
        con.display();
        sc.close();
    }
}

 
