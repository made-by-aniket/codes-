import java.util.*;
public class LaptopDemo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String ne;
        String pro;
        int prii;
        Laptop l2=new Laptop();
        Laptop l3=new Laptop("Asus");
        Laptop l4=new Laptop("Asus","i5");
        Laptop l5=new Laptop("MSI","i5",90000);
        Laptop l6=new Laptop(l5);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);

    }
}
