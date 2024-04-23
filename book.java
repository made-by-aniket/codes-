import java.util.*;
public class book {
    private int ID;
    private String bookname;
    private String author;
    private String publisher;
    private int mrp;
    public void acceptBook()
    {
        Scanner sc=new Scanner(System.in);
        this.ID=sc.nextInt();
        sc.nextLine();
        this.bookname=sc.nextLine();
        this.author=sc.nextLine();
        this.publisher=sc.nextLine();
        this.mrp=sc.nextInt();

    }
    public void displayBook()
    {
        System.out.println("Book ID="+this.ID);
        System.out.println("Book Name is="+this.bookname);
        System.out.println("Author is="+this.author);
        System.out.println("The MRP is="+this.mrp);
    }
}
