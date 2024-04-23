public class Election {
    private int age;
    private int vid;
    public Election(int a,int v)
    {
        this.age=a;
        this.vid=v;
    }
    public void voting() throws IdException,AgeException
    {
        if(this.age<18)
        {
            throw new AgeException(this.age);
        }
        else {
            if(this.vid>=100&&this.vid<=200)
            {
                System.out.println("Allowed to vote");
            }
            else {
                throw new IdException(this.vid);
            }
        }
    }
}
