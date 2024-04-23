public class CarDemo {
    public static void main(String[] args)
    {
        Car c1=new Car();
        Car c2=new Car();
        System.out.println("Enter the details of Car 1");
        c1.Accept();
        System.out.println("Enter the details of Car 2");
        c2.Accept();
        System.out.println("The details of Car 1");
        c1.Display();
        System.out.println("The details of CAr 2");
        c2.Display();
    }
}
