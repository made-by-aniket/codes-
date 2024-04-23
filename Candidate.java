import java.util.Scanner;

public abstract class Candidate {
    private String name;
    private int age;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        this.name=sc.next();
        this.age=sc.nextInt();
    }
    public String toString()
    {
        return "The name is"+this.name+"The age is"+this.age;
    }
    public abstract boolean isSelected();
}
