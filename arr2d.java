import java.util.Scanner;

public class arr2d {
public static void main(String[] args) {
    Scanner y= new Scanner(System.in);
    int n=y.nextInt();
    int[][] a = new int[n][n];
    
    
    System.out.println("enter array");
    for(int i=0;i<a.length;i++)
    {
       for(int j=0;j<a.length;j++)
       {
        a[i][j]=y.nextInt();
       }
    

       
    }
    for(int i=0;i<a.length ;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(" "+ a[i][j]);

        }
        System.out.println("");
    }
 }
 }
   
    
    
   
    


