import java.util.*;
public class Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        factorial f=new factorial();
        binary b=new binary();
        int n=sc.nextInt();
        System.out.println(f.fact(n));
        b.binary(n);
    }
}
class factorial{
    int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
}
class binary{
    void binary(int n)
    {
        ArrayList <Integer> intr=new ArrayList<>();
        while(n!=0)
        {
            intr.add(n%2);
            n/=2;
        }
        for(int i=intr.size()-1;i>=0;i--)
        {
            System.out.print(intr.get(i));
        }
    }
}