import java.util.*;
public class Problem43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        c2 obj=new c2(x,y,z,"sathvik");
        System.out.println(obj.a);
    }
}
class c1
{
    double a,b,c;
    static double cuber(double a)
    {
        return Math.pow(a, 3);
    }
    c1(double a,double b,double c)
    {
        this.a=cuber(a);
        this.b=cuber(b);
        this.c=cuber(c);
    }
}
class c2 extends c1
{
    String ref;
    c2(double a,double b,double c,String ref)
    {
        super(a,b,c);
    }
}   