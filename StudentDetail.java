import java.util.*;
public class StudentDetail {
    private int roll;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int total;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        this.roll=sc.nextInt();
        this.m1=sc.nextInt();
        this.m2=sc.nextInt();
        this.m3=sc.nextInt();
        this.m4=sc.nextInt();
        sc.nextLine();
        this.name=sc.nextLine();
    }
    public void calculateTotal()
    {

        this.total=this.m1+this.m2+this.m3+this.m4;
    }
    public void display()
    {
        if(this.total>=300)
        {

            System.out.println(this.roll+" "+this.name+" "+this.m1+" "+this.m2+" "+this.m3+" "+this.m4+" "+this.total+" "+"Pass");
        }
        else {
            System.out.println(this.roll+" "+this.name+" "+this.m1+" "+this.m2+" "+this.m3+" "+this.m4+" "+this.total+" "+"Fail");
        }

    }

}
