import java.util.*;
public class Typist extends Candidate{
    private int speed;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        super.accept();
        this.speed=sc.nextInt();
    }
    public String toString()
    {
        return super.toString()+"The speed is"+this.speed;
    }
    public boolean isSelected()
    {
        if(this.speed>20)
        {
            return true;
        }
        else {
            return false;
        }
    }

}
