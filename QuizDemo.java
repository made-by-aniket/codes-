import java.util.Scanner;

public class QuizDemo {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String co=sc.nextLine();
    int ma=sc.nextInt();

    Quiz c1=Quiz.getInstance();
    c1.info(co,ma);
    System.out.println(c1);
}
}
