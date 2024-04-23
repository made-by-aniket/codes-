public class StudentDetailDemo {
    public static void main(String[] args)
    {
        StudentDetail s1=new StudentDetail();
        StudentDetail s2=new StudentDetail();
        StudentDetail s3=new StudentDetail();
        System.out.println("Enter the details of s1");
        s1.accept();
        System.out.println("Enter the details of s2");
        s2.accept();
        System.out.println("Enter the details of s3");
        s3.accept();
        s1.calculateTotal();
        s2.calculateTotal();
        s3.calculateTotal();
        System.out.println("Rno Name M1 M2 M3 M4 Total Result");
        System.out.println("----------------------------------------");
        s1.display();
        s2.display();
        s3.display();
    }
}
