
import java.util.Scanner;

public class shape {
    public static void main(String[] args) {
        Scanner y=new Scanner (System.in);
        circle obj=new circle();
        square obj2=new square();
        rectangle obj3=new rectangle();
        obj.circlearea(y);
        obj2.squarearea(y);
        obj3.rectanglearea(y);
        


    }
    
}
class circle extends shape 
{
    
    void circlearea(Scanner y)
    {
        System.out.println("enter radius");
         int r=y.nextInt();
        System.out.println("the area of circle id"+ r*r*3.14);
    }
}
class square extends shape 
{
    void squarearea(Scanner y){
    System.out.println("enter side");

    int s=y.nextInt();
    System.out.println("the are of square"+ s*s);
    }
}
class rectangle extends shape{
    void rectanglearea(Scanner y)
    {
        System.out.println("enter length");
        int l=y.nextInt();
        System.out.println("enter breath");
        int b=y.nextInt();
        System.out.println("area of rectangle is "+ l*b);
    }
}
