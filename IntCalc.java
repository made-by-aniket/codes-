import java.sql.SQLOutput;

public class IntCalc implements Calculator {
    private int a;
    private int s;
    private int su;
    private int m;
    private int d;
    private int b;
    public IntCalc(int n1,int n2)
    {
        this.a=n1;
        this.b=n2;
    }
    public void add()
    {
        this.s=this.a+this.b;
    }
    public void sub()
    {
        this.su=this.a-this.b;
    }
    public void mult()
    {
        this.m=this.a*this.b;
    }
    public void div()
    {
        this.d=this.a/this.b;
    }
    public String toString()
    {
        return "the add is"+this.s+"the sub is"+this.su+"the mult is"+this.m+"the div is"+this.d;
    }
}
