class example
{
    static int count=0;

    public example() {
        count=count+1;
    }
    public void disp()
    {
        System.out.println("objects created:"+count);
    }
    
}

public class countingobjects
 {
    public static void main(String[] args) {
        example obj1=new example();
        example obj2=new example();
        example obj3=new example();
        obj2.disp();

    }
    
}

