public class IdException extends Exception{
private int id;
public IdException(int v)
{
    this.id=v;
}
public String toString()
{
    return "Wrong id";
}
}
