import java.util.*;
public class DateOfBirth {
private int birthdate;
private int month;
private int year;
private int yr;
public void DOB()
{
    Scanner sc=new Scanner(System.in);
    this.birthdate=sc.nextInt();
    this.month=sc.nextInt();
    this.year=sc.nextInt();
}
public void currentDate()
{
    Scanner sc=new Scanner(System.in);
    this.birthdate=sc.nextInt();
    this.month=sc.nextInt();
    this.year=sc.nextInt();
}
public int age(DateOfBirth cd)
{
     return yr=cd.year-this.year;
}
public void displayAge()
{
    System.out.println("The age is:"+yr);
}
}
