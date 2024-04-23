import java.util.*;
public class EmploueeDemo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int max;
        System.out.println("Enter Retirement Age ");
        max=sc.nextInt();
        emplouee.setRetirementage(max);
        int n;
        n=sc.nextInt();
        emplouee employees[]=new emplouee[n];
        for(int i=0;i<n;i++)
        {
            employees[i]=new emplouee();
            System.out.println("Enter the Employee "+(i+1)+" details ");
            employees[i].accept();

        }
        for(int i=0;i<n;i++)
        {
            System.out.println("The details of Employee "+(i+1)+" is "+employees[i]);
            System.out.println("The left age before for employee "+(i+1)+"is "+employees[i].leftage());

        }
    }
}
