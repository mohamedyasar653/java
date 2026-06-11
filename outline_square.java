import java.util.*;
public class outline_square {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        System.out.println("enter number");
        int n=y.nextInt();
          for(int i=0;i<=n;i++)
            {
                
                for(int j=0;j<=n;j++)
                {
                    if(i==0 || i==n-1 || j==0 || j==n-1)
                    {

                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
              
                System.out.println("");
            }
    }
    
}
