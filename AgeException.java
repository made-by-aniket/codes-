public class AgeException extends Exception{
    private int age;
public AgeException(int a)
{
 this.age=a;
}
public String toString()
{
    return "Not suitable age";
}
}
