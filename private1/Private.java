package private1;
public class Private {
    public static void main(String[] args) {
        PrivateExample obj=new PrivateExample();
        //System.out.println(obj.a);     //Error
        //obj.greet("Sathvik");          //Error
    }
}
class PrivateExample
{
    private int a=20;
    private void greet(String s)
    {
        System.out.println("Hello "+s);
    }
    PrivateExample()
    {
        System.out.println(a);
        this.greet("Sathvik");
    }
}