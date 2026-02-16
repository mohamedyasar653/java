
import java.util.Scanner;

public class rowrotation {
    static void rotation(int[] row,int k)
    {
        int n=row.length;
        int[] temp=new int[k];
        for(int i=0;i<k;i++)
        {
            temp[i]=row[i];
        }
        for(int i=k;i<n;i++)
        {
            row[i-k]=row[i];
        }
        for(int i=0;i<k;i++)
        {
            row[n-k+i]=temp[i];
        }
    }
    public static void main(String[] args)
    {
        Scanner y=new Scanner(System.in);
        int row;
        int col;
        System.out.println("enter row");
        row=y.nextInt();
        System.out.println("enter col");
        col=y.nextInt();
        int[][] a=new int[row][col]; 
        System.out.println("enter  values");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=y.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            rotation(a[i],i);
        }
        System.err.println("after left rotation");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }

        

    }
    
}
