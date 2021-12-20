import java.util.*;
class john{
    String s="public void displayAll(User[] userArray)";
    String s1="public Boolean deleteUser(User[] userArrray,String name)";
    String name;
    String no;
    String uname;
    String pass;
    Solution(String name,String no,String uname,String pass)
    {
        this.name=name;
        this.no=no;
        this.uname=uname;
        this.pass=pass;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        Solution sol[]=new Solution[n];
        for(int i=0;i<n;i++)
        {
            String name=sc.next();
            String no=sc.next();
            String uname=sc.next();
            String pass=sc.next();
            sol[i]=new Solution(name,no,uname,pass);
        }
        String fname=sc.next();
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            System.out.println(sol[i].name+" "+sol[i].no+" "+sol[i].uname+" "+sol[i].pass);
        }
        for(int i=0;i<n;i++)
        {
            if(sol[i].name.equals(fname))
            {
                System.out.print("User deleted successfully");
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.print("No user found with the given name");
        sc.close();
    }
}
