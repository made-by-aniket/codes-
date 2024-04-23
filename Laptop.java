import java.util.*;
public class Laptop {
    private String name;
    private String processor;
    private int price;
    public Laptop()
    {
        this.name="Dell";
        this.processor="i7";
        this.price=95000;
    }
    public Laptop(String n)
    {
        this.name=n;
        this.processor="i5";
        this.price=75000;
    }
    public Laptop(String na,String p)
    {
        this.name=na;
        this.processor=p;
        this.price=80000;
    }
    public Laptop(String nm,String pr,int pri)
    {
        this.name=nm;
        this.processor=pr;
        this.price=pri;
    }
    public Laptop(Laptop l1)
    {
        this.name=l1.name;
        this.processor=l1.processor;
        this.price=l1.price;
    }
    public String toString()
    {
        return "laptop";
    }
}
