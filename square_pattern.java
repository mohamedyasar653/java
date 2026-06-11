import java.util.*;
class square_pattern
{
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        {
            System.out.println("enter number");
            int n=y.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("*");
                }
                System.err.println("");
            }

        }
    }
}