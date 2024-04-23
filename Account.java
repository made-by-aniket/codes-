import java.util.*;
public class Account {
     public String name;
    public int bal;
   public int number;

    public void accept()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter Balance:");
        bal=sc.nextInt();
        System.out.println("Enter Number:");
        number=sc.nextInt();
    }
    public void display()
    {
        System.out.println("The name is"+name);
        System.out.println("The balance is"+bal);
        System.out.println("The number is"+number);

    }
    public boolean withdraw(int money)
    {

        if(this.bal>money)
        {
            return true;
        }
        else {
            return false;
        }

    }
    public void deposit(int m)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter money to be deposited");
        m=sc.nextInt();
        System.out.println("Successfully Deposited! Balance is:"+this.bal+m);
    }
    public boolean checkbal(Account m2)
    {
        if(this.bal>m2.bal)
        {
            return true;
        }
        else if(this.bal<m2.bal)
        {
            return false;
        }
        else {
            return false;
        }
    }

}
