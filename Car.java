import java.util.*;
public class Car {
    private int reg;
    private String model;
    private int engineno;
    private String ownername;
    private int seating;
    private String fuel;
    public void Accept()
    {
        Scanner sc=new Scanner(System.in);
        this.reg=sc.nextInt();
        this.engineno=sc.nextInt();
        this.seating=sc.nextInt();
        sc.nextLine();
        this.model=sc.nextLine();
        this.ownername=sc.nextLine();
        this.fuel=sc.nextLine();
    }
    public void Display()
    {
        System.out.println("Reg number is "+this.reg);
        System.out.println("Engine number is "+this.engineno);
        System.out.println("Model  is "+this.model);
        System.out.println("Owner name is "+this.ownername);
        System.out.println("Seating number is "+this.seating);
        System.out.println("Fuel type is "+this.fuel);


    }
}
