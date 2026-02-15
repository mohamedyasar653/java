import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);

        System.out.println("enter size");
        int n = y.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("enter first array");
        for (int i = 0; i < n; i++) {
            a[i] = y.nextInt();
        }

        System.out.println("enter second array");
        for (int i = 0; i < n; i++) {
            b[i] = y.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0 j<n ;j++)
            {
                if(a[i]==b[j])
                {
                    count++;
                }
            }
        }
        if(count==n)
        {
            System.out.println("rotation");
        }
        else 
        {
            System.out.println("no");
        }
    }
}

        