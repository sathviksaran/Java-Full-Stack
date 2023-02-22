import java.util.*;
public class Problem43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        B obj=new B(x,y,z,"sathvik");
        System.out.println(obj.a);
    }
}
class A
{
    double a,b,c;
    static double cuber(double a)
    {
        return Math.pow(a, 3);
    }
    A(double a,double b,double c)
    {
        this.a=cuber(a);
        this.b=cuber(b);
        this.c=cuber(c);
    }
}
class B extends A
{
    String ref;
    B(double a,double b,double c,String ref)
    {
        super(a,b,c);
    }
}   