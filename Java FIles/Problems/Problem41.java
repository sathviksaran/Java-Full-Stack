public class Problem41 {
    public static void main(String[] args) {
        cons2 a1=new cons2(30);
        cons2 a2=new cons2(40);
        cons2 a3=new cons2(50);
        Child3 obj=new Child3();
        obj.sum(a1,a2,a3);
    }
}
class cons2
{
    int n;
    cons2(int n)
    {
        this.n=n;
    }
}
class method
{
    static void sum(cons2 a1,cons2 a2,cons2 a3)
    {
        System.out.println("sum = "+(a1.n+a2.n+a3.n));
    }
}
class Child3 extends method
{
    
}