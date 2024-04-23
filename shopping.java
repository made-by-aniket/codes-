import java.util.Scanner;

public class shopping {
  private static shopping instance;
  private double total;
  private shopping()
    {
total=0;
    }
    public static shopping getInstance()
    {
        if(instance==null)
        {
            instance=new shopping();
        }
        return instance;
    }
    public void findtot(items item)
    {

        total+=item.getTotalPrice();
    }
    public String toString()
    {

        return "The total is"+total;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            items[] O = new items[3];
            shopping s1 = shopping.getInstance();
            for(int i=0;i<3;i++)
            {
                O[i] = new items();
                System.out.println("Price of item "+(i+1)+" is: "+ (O[i].getTotalPrice()));
                s1.findtot(O[i]);
            }
            System.out.println(s1);



    }
}


