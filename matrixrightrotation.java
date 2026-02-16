import java.util.*;
public class matrixrightrotation 
{
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
            rightrotation(a[i],i);
        }
        System.err.println("after right rotation");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }

        

    }

    static void rightrotation(int[] row, int k)
    {
        int n=row.length;
        k=k%n;
        int [] temp=new int[k];
        for(int i=0;i<k;i++)
        {
            temp[i]=row[n-k+i];
        }
        for(int i=n-k-1;i>=0;i--)
        {
            row[i+k]=row[i];
        }
        for(int i=0;i<k;i++)
        {
            row[i]=temp[i];
        }



    }
    
}


