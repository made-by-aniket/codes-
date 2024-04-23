import java.util.*;
public class obj {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
        Account p1=new Account();
        System.out.println("Enter the  details of person1:");
        p1.accept();
        System.out.println("The details of person 1 are:");
        p1.display();
        Account p2=new Account();
        System.out.println("Enter the details of person 2:");
        p2.accept();
        System.out.println("The details of person 2 are:");
        p2.display();
        int money;
        money=sc.nextInt();
        if(p1.withdraw(money))
        {
             System.out.println("Possible");
        }
        else {
            System.out.println("Not Possible");
        }



    }
}
