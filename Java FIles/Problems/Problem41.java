public class Problem41 {
    public static void main(String[] args) {
        class1 a1=new class1(30);
        class1 a2=new class1(40);
        class1 a3=new class1(50);
        class3 obj=new class3();
        obj.sum(a1,a2,a3);
    }
}
class class1
{
    int n;
    class1(int n)
    {
        this.n=n;
    }
}
class class2
{
    static void sum(class1 a1,class1 a2,class1 a3)
    {
        System.out.println("sum = "+(a1.n+a2.n+a3.n));
    }
}
class class3 extends class2
{

}