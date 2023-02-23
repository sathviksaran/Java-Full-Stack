import java.util.*;
public class Problem45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ref=sc.nextInt();
        Child2 obj=new Child2(ref);
        System.out.println(obj.diff);
    }
}
class Parent2
{
    int g;
    static ArrayList<Integer> intr=new ArrayList<>();
    static int diff;
    Parent2(int g)
    {
        int gh=g;
        while(gh!=0)
        {
            int temp1=gh%10;
            gh=gh/10;
            intr.add(temp1);
            this.g=g;
        }
        int oddsum=0,evensum=0;
        for(int i=0;i<intr.size();i++)
        {
            if(i%2==0)
            {
                oddsum+=intr.get(i);
            }
            else
            {
                evensum+=intr.get(i);
            }
        }
        diff=Math.abs(evensum-oddsum);
    }
}
class Child2 extends Parent2{
    Child2(int g)
    {
        super(g);
    }
}