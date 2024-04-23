import java.util.*;
public class PatientDemo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        Patient o[]=new Patient[4];
        for(int i=0;i<4;i++)
        {
            String n=sc.next();
            int a=sc.nextInt();
            String d=sc.next();
            o[i]=new Patient(n,a,d);
         if(d=="Corona")
         {
              o[i]=new Patient(n,a);
         }
         System.out.println(o[i]);

        }
    }
}
