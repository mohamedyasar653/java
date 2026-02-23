import java.util.*;
public class displaystring {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        System.out.println("enter array size");
        int n=y.nextInt();
        String [] a=new String[n];
        System.out.println("enter strings");
        for(int i=0;i<n;i++)
        {
            a[i]=y.next();
        }
        System.out.println("the strings starting with rev are");
        for (int i = 0; i < n; i++) {
            if(a[i].charAt(0)=='r' && a[i].charAt(1)=='e' && a[i].charAt(2)=='v' )
                System.out.println(" "+a[i]);
            
            
        }
       
        }
    }
    

