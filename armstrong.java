import java.util.*;
public class armstrong {
    
    public static void main(String[] args)
    {
        Scanner y=new Scanner(System.in);
        System.out.println("enter number");
        int n=y.nextInt();
        int count=0;
        int sum=0;
        while(n!=0)
        {
           
            n=n/10;
            count++;

        }
        System.out.println(count);
            

        

    }
}