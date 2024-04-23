public class Pongal implements Festival{

    private int n;
    private int c;
    public Pongal(int co,int ki)
    {
        this.c=co;
        this.n=ki;
    }
    public void celebrate()
    {
        System.out.println("The kites are"+this.n);
        System.out.println("The colours required are"+this.c);
    }
    public void wishes()
    {
        System.out.println("Ehhhhhhhhh....");
    }

}
