import java.util.Scanner;

public class items {
   private double cost;
   private int quantity;
   public items()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter quantity");
      this.quantity=sc.nextInt();
      System.out.println("Enter cost");
      this.cost=sc.nextDouble();
   }
   public double getTotalPrice()
   {

      return quantity*cost;
   }
}
