import java.util.ArrayList;
public class Problem50 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        fact f1=new fact(3);
        fact f2=new fact(4);
        fact f3=new fact(5);
        fact f4=new fact(6);
        fact f5=new fact(7);
        numbers.add(f1.a);
        numbers.add(f2.a);
        numbers.add(f3.a);
        numbers.add(f4.a);
        numbers.add(f5.a);
        System.out.println(numbers);
    }
}
class fact
{
    int a;
    static int fact(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact*=i;
        }
        return fact;
    }
    fact(int a)
    {
        this.a=fact(a);
    }
}