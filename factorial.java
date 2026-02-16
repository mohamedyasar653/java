import java.util.*;
public class noofdigit {
    
    public static void main(String[] args)
    {
        Scanner y=new Scanner(System.in);
        System.out.println("enter number");
        int n=y.nextInt();
       
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
       
        System.out.println(fact);
            

        

    }
}