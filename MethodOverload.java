public class MethodOverload {
    public static void main(String[] args) {
        checker();
    }
    static void checker()
    {
        System.out.println("No parameter passed");
    }
    static void checker(int ref)
    {
        System.out.println(ref+"sum");
    }
    static void checker(int a,int b)
    {
        System.out.println(a+b);
    }
    static void checker(int p,int q,int r)
    {
        System.out.println(p+q+r);
    }
}
