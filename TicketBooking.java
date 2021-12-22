import java.util.Scanner;

class TicketBooking {
    String se;
    String c;
    String nos;
    TicketBooking(String se,String c,String nos){
        this.c=c;
        this.se=se;
        this.nos=nos;
    }
    public void makePayment(Double amount){
        System.out.printf("%s %s %s %.1f",this.se,this.c,this.nos,amount);
    }
    public void makePayment(String walletNumber ,Double amount){
        System.out.printf("%s %s %s %.1f %s",this.se,this.c,this.nos,amount,walletNumber);
    }
    public void makePayment(String creditCard,String ccv,String name,Double amount){
        System.out.printf("%s %s %s %s %.1f %s %s",this.se,this.c,this.nos,name,amount,creditCard,ccv);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(",");
        TicketBooking x = new TicketBooking(arr[0],arr[1],arr[2]);
        int n=sc.nextInt();
        if(n==1){
            double a=sc.nextDouble();
            x.makePayment(a);
        }
        else if(n==2){
            double a=sc.nextDouble();
            sc.nextLine();
            String b=sc.nextLine();
            x.makePayment(b,a);
        }
        else if(n==3){
            sc.nextLine();
            String c=sc.nextLine();
            double a=sc.nextDouble();
            sc.nextLine();
            String b=sc.nextLine();
            String d=sc.nextLine();
            x.makePayment(b,d,c,a);
        }
        else{
            System.out.print("Invalid Choice");
        }

    }
}