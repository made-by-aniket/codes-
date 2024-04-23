import java.util.Scanner;
import java.util.regex.*;

public class PanCard {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String p= sc.nextLine();
        String regex="[A-Z]{5}[0-9]{4}[A-Z]{1}";
        String reg="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%])(?=\\S+$).{8,}$";
        Pattern pa=Pattern.compile(regex);
        Matcher m=pa.matcher(p);
        if(m.matches())
        {
            System.out.println("Valid pancard");
        }
        else {
            System.out.println("Nope");
        }

    }
}
