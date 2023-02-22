import java.util.*;
public class Problem45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ref=sc.nextInt();
        class3 obj=new class3(ref);
        System.out.println(obj.intr);
    }
}
class class2
{
    int g;
    static ArrayList<Integer> intr=new ArrayList<>();
    class2(int g)
    {
        int gh=g;
        while(gh!=0)
        {
            int temp1=gh%10;
            int temp2=gh/10;
            intr.add(temp1);
            this.g=g;
        }
    }
}
class class3 extends class2{
    class3(int g)
    {
        super(g);
    }
}