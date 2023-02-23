package default1;
public class Default {
    public static void main(String[] args) {
        DefaultExample obj=new DefaultExample();
        System.out.println(obj.a);
        obj.greet("Srujana");
    }
}
class DefaultExample
{
    int a=20;
    void greet(String s)
    {
        System.out.println("Hello "+s);
    }
    DefaultExample()
    {
        System.out.println(a);
        this.greet("Tanuja");
    }
}