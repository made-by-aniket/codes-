import java.util.*;
public class emplouee {
    private int id;
    private String name;
    private int presentage;
    private static int retirementage;

    public static void setRetirementage(int n)
    {
        emplouee.retirementage=n;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        this.id=sc.nextInt();

        this.name=sc.nextLine();
        sc.nextLine();
        this.presentage=sc.nextInt();

    }
    public int  leftage()
    {
        return emplouee.retirementage-this.presentage;
    }
    public String toString()
    {
        return "The id is "+this.id+
                " The name is "+this.name+
                " The present age is "+this.presentage;
    }
}
