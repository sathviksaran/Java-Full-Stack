import java.util.*;
public class Problem33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A obj=new A();
        ArrayList<Integer> intr=new ArrayList<>();
        while(sc.hasNextInt())
        {
            intr.add(sc.nextInt());
            if(intr.size()>3){
                break;
            }
        }
        if(intr.size()==0)
        {
            obj.m1();
        }
        else if(intr.size()==1)
        {
            obj.m1(intr.get(0));
        }
        else if(intr.size()==2)
        {
            obj.m1(intr.get(0),intr.get(1));
        }
        else if(intr.size()==3)
        {
            obj.m1(intr.get(0),intr.get(1),intr.get(2));
        }
        else
        {
            obj.m1(intr.get(0),intr.get(1),intr.get(2),intr.get(3));
        }
    }
}
class A{
    void m1()
    {
        System.out.println("No parameters passed");
    }
    void m1(int n)
    {
        System.out.println(n);
    }
    void m1(int m,int n)
    {
        int m1=((m/10)*10)+n/10;
        System.out.println(m1);
        int n1=((m%10)*10)+n%10;
        System.out.println(n1);
        int diff=Math.abs(m1-n1);
        System.out.println(diff);
        double fact=1;
        for(int i=1;i<=diff;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    }
    void m1(int a,int b,int c)
    {
        int a1=((a%10)*10)+a/10;
        int b1=((b%10)*10)+b/10;
        int c1=((c%10)*10)+c/10;
        System.out.println(a1+b1+c1);
    }
    void m1(int p,int q,int r,int s)
    {
        System.out.println("No more arguments");
    }
}