
import java.util.Scanner;

public class ascending
 {
    public static void main(String[] args)
     {
        Scanner y=new Scanner(System.in);

        int n;
        System.out.println("enter array size");
        n=y.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=y.nextInt();
            
        }
        int temp=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("ascending order is");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
        
       
            
        }
    }
    

