public class DetailsDemo {
    public static void main(String[] args)
    {
        CustomerDetails c1=new CustomerDetails();
        System.out.println("Enter the details of Customer");
        c1.Accept();
        c1.calculateBill();
    }
}
