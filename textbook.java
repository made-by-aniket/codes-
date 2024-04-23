import java.util.*;
public class textbook {
    public String name;
    public String author;
    public double price;
    public int nop;
    public void acceptbook()
    {
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        author=sc.nextLine();
        price=sc.nextDouble();
        nop=sc.nextInt();
    }
    public void displaybook()
    {
        System.out.println("Book Name:"+name);
        System.out.println("Author Name:"+author);
        System.out.println("Price:"+price);
        System.out.println("The no.of.pages are:"+nop);
    }
    public void discount()
    {
        if(price>nop)
        {
            System.out.println("Book is costly");
        }
        else if(price==nop)
        {
            System.out.println("Book price is normal");
        }
        else if(price<nop)
        {
            System.out.println("Yeh Gareeb iski maa ki...");
        }
    }
}
