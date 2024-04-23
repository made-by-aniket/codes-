import java.util.*;
public class noob {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n;
        int d;
        d=sc.nextInt();
        n=sc.nextInt();
        int[] temp=new int[n];
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=0;
        for(int i=d;i<n;i++)
        {
            temp[k]=a[i];
            k++;
        }
        for(int i=0;i<d;i++)
        {
            temp[k]=a[i];
            k++;
        }
        for(int i=0;i<n;i++)
        {
          a[i]=temp[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }


    }
}
