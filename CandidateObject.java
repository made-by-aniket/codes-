import java.util.Scanner;

public class CandidateObject {
    public static void main(String[] args)
    {
        int co=0;
        Scanner sc=new Scanner(System.in);
        Candidate c[]=new Candidate[5];
        for(int i=0;i<c.length;i++)
        {
            System.out.println("Enter the job detail");
            String ch=sc.next();
            if(ch.equals('t'))
            {
                c[i]=new Typist();
                c[i].accept();
            }
            else {
                c[i]=new Security();
                c[i].accept();
            }

        }
        for(int i=0;i<c.length;i++)
        {
            if(c[i].isSelected())
            {
                System.out.println("Selected");
                co++;
            }
            System.out.println("The selected candidates is"+co);
        }
    }
}
