import java.util.*;
public class Problem42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Child1 obj=new Child1();
        ArrayList<Integer> intr=new ArrayList<>();
        while(sc.hasNextInt())
        {
            intr.add(sc.nextInt());
        }
        obj.result(intr);
    }
}
class Parent1
{
    static void result(ArrayList<Integer> intr)
    {
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
        System.out.println(Math.abs(evensum-oddsum));
    }
}
class Child1 extends Parent1
{
    
}