public class Quiz {
    private static Quiz instance;
    private String course;
    private int marks;
    private Quiz() {


    }
    public static Quiz getInstance()
    {
        if(instance==null)
        {

            instance=new Quiz();
        }
        return instance;
    }
    public void info(String c,int m)
    {
        course=c;
        marks=m;
    }

    public String toString()
    {
        return "The course name is "+course+" The marks are "+marks;
    }
}
