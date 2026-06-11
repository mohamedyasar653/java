import java.util.*;
public class h_pattern {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        System.out.println("enter number");
        int n=y.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print("*");
            for(int j=0;j<n;j++)
            {
                if(j==n-1||i==n/2)
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
