public class Date {
    private int date;
    private int month;
   private int year;
   public Date(int d,int m,int y)
   {
       this.date=d;
       this.month=m;
       this.year=y;
   }
   public Date()
   {
       this.date=23;
       this.month=4;
       this.year=2003;
   }
   public Date(int d)
   {
       this.date=d;
       this.month=4;
       this.year=2004;
   }
   public Date(int d,int m)
   {
       this.date=d;
       this.month=m;
       this.year=2003;
   }
   public String toString()
   {
       return "The date is\n"+this.date+"The month is\n"+this.month+"The year is\n"+this.year;
   }
}
