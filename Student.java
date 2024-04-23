import java.util.*;
public abstract class Student implements Comparable {
    private int ID;
    private String name;
    private String course;
    private int fee;
    public  Student(int i,String n,String c,int f)
    {

        this.ID= i;

        this.name=n;
        this.course=c;
        this.fee=f;
    }
    public void DisplayData()
    {
        System.out.println("ID:"+this.ID);
        System.out.println("Name:"+this.name);
        System.out.println("Course:"+this.course);
        System.out.println("Fees:"+this.fee);
    }
    public int compareTo(Student s)
    {
        if(this.fee==s.fee)
            return 0;
        else if(this.fee>s.fee)
            return 1;
        else
            return -1;
    }
}
