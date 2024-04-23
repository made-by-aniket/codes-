public class Patient {
    private int id;
    private String name;
    private String disease;
    private int ag;
    private static int i=101;
    public Patient(String name,int a,String d)
    {

        this.id=i;
        i++;
        this.name=name;
        this.ag=a;
        this.disease=d;

    }
    public Patient(String name,int a)
    {
        this.id=i;
        i++;
        this.name=name;
        this.ag=a;
        this.disease="Corona";
    }
    public String toString()
    {
        return "The id is "+this.id+" The name is "+this.name+" The age is "+this.ag+" The disease is "+this.disease+"\n";
    }
}
