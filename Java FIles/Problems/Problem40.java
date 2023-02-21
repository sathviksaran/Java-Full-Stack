public class Problem40 {
    public static void main(String[] args) {
        multiply m=new multiply();
        m.calculate(20, 30, 40);
        m.calculate(1, 2, 3, 4, 5);
    }
}
class sum
{
    static void calculate(int n1,int n2,int n3,int n4,int n5)
    {
        System.out.println(n1+n2+n3+n4+n5);
    }
}
class multiply extends sum
{
    static void calculate(int n1,int n2,int n3)
    {
        System.out.println(n1*n2*n3);
    }
}