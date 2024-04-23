import java.util.*;
public class Security extends Candidate{
    private int fitl;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        super.accept();
        this.fitl=sc.nextInt();
    }
    public String toString()
    {
        return super.toString()+"The fitness level is"+this.fitl;
    }
    public boolean isSelected()
    {
        if(this.fitl>7&&this.fitl<=10)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
