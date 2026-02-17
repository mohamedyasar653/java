import java.util.*;
class matrixrotation{
    public static void main(String[] args)
    {
        Scanner y=new Scanner(System.in);
        System.out.println("enter size");
        int n=y.nextInt();
        int[][] a=new int[n][n];
        System.out.println("enter values");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=y.nextInt();

            }
        }
        for (int i = 0; i < n; i++) 
        {
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(a[j][i]+" ");

            }
            System.out.println("");
        }
            
        

    }
}