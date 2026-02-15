import java.util.*;
public class addlongint {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);

        String c;
        String d;
        System.out.println("enter A value:");
        c=y.nextLine();
        System.out.println("enter B value");
        d=y.nextLine();
        String res = " ";
        int carry = 0;
        int i = c.length()-1;
        int j = d.length()-1;
        int sum=0;
        while(i>=0||j>=0||carry>0)
        {
            int s1=(i>=0)?c.charAt(i)-'0':0;
            int s2=(j>=0)?d.charAt(i)-'0':0;
            sum=s1+s2+carry;
            carry=sum/10;
            res=(sum%10)+res;
            i--;
            j--;

        }
        System.out.println(res);
       
    }
    
}
