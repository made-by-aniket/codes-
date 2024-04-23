import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Stu
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        ArrayList<Student> al= new ArrayList<>();
int id;
String n;
String c;
int f;


        for(int i=0;i<3 ;i++) {
            id=sc.nextInt();
            n=sc.next();
            c=sc.next();
            f=sc.nextInt();



            al.add(new Student(id,n,c,f));
          
        }
        Iterator<Student> a= al.iterator();
        while(a.hasNext())
        {
            Student s=a.next();
            s.DisplayData();
        }
    }

}
