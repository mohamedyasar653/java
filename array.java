
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);

        int n;
        System.out.println("enter array size");
        n=y.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=y.nextInt();
            
        }
        System.out.println("array elements");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            
        }
        System.out.println("the length"+a.length);
    }
    
}
