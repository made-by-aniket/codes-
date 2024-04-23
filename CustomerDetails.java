import java.util.*;
public class CustomerDetails {
    private double units;
    private double bill;
    public void Accept()
    {
        Scanner sc=new Scanner(System.in);
        this.units=sc.nextInt();
    }
    public void calculateBill()
    {
        if(this.units<=100)
        {
            this.bill=1*this.units+25;
            System.out.println("The bill is:"+this.bill);
        }
        else if(this.units>101&&this.units<=200)
        {
            this.bill=2*this.units+30;
            System.out.println("The bill is:"+this.bill);
        }
        else if(this.units>201&&this.units<=300)
        {
            this.bill=3*this.units+40;
            System.out.println("The bill is:"+this.bill);
        }
        else if(this.units>301&&this.units<=400)
        {
            this.bill=4*this.units+50;
            System.out.println("The bill is:"+this.bill);
        }
        else if(this.units>401&&this.units<=500)
        {
            this.bill=4*this.units+60;
            System.out.println("The bill is:"+this.bill);
        }
        else if(this.units>501)
        {
            this.bill=5*this.units+100;
            System.out.println("The bill is:"+this.bill);
        }
    }
}
