public class BirthClass {
    public static void main(String[] args)
    {
        DateOfBirth d1=new DateOfBirth();
        DateOfBirth cd=new DateOfBirth();
        System.out.println("Enter DOB");
        d1.DOB();
        System.out.println("Enter Current date");
        cd.currentDate();
        d1.age(cd);
        d1.displayAge();
    }
}
