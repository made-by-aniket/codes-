public class VotingDemo {
    public static void main(String[] args)
    {
        Election e1=new Election(22,115);
        try{
            e1.voting();
            System.out.println("Caste Your Vote:");
        }
        catch (IdException i)
        {
            System.out.println("The exception is "+i);
        }
        catch (AgeException a)
        {
            System.out.println("The exception is "+a);
        }

    }
}
