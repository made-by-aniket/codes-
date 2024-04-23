import java.util.*;
public class DateDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        Date d1 = new Date(d, m, y);
        Date d2 = new Date();
        Date d3= new Date(d,m);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

}
