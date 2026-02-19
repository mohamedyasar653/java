import java.util.*;
class a
{
    int a,b;
    public void getdata()
    {
        Scanner y=new Scanner(System.in);
        System.out.println("enter a");
        a=y.nextInt();
        System.out.println("enter b");
        b=y.nextInt();
    }
}
public class singleinheritance extends a {
    int c;
    public void sum()
    {
        c=a+b;
        System.out.println("sum="+c);

    }
    public static void main(String[] args) {
        singleinheritance obj=new singleinheritance();
        obj.getdata();
        obj.sum();
    }
    
}
