
import java.util.Scanner;

public class arrayduplicate {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);

        int n;
        System.out.println("enter array size");
        n=y.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=y.nextInt();
            
        }
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
        }
            
        
        System.out.println("count:"+count);
    }
    
}
