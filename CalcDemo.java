public class CalcDemo {
    public static void main(String[] args)
    {
        Calculator c1=new IntCalc(5,6);
        Calculator c2=new DoubleCalc(4.5,8.9);
        c1.add();
        c1.sub();
        c1.mult();
        c1.div();
        System.out.println(c1);
        c2.add();
        c2.sub();
        c2.mult();
        c2.div();
        System.out.println(c2);
        

    }
}
