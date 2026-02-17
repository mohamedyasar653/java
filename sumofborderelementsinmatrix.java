import java.util.*;
public class sumofborderelementsinmatrix {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        System.out.println("enter size");
        int n=y.nextInt();
        int[][] a=new int[n][n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=y.nextInt();
            }
        }
       
            int sum=0;
        
        for(int i=0;i<n;i++)
        {
            

            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1)
                {
                    sum+=a[i][j];
                }
                else if(j==0 || j==n-1)
                {
                    sum+=a[i][j];

                }

                


            }

        }
        System.out.println("the sum="+sum);
     
        
    }

    
}
