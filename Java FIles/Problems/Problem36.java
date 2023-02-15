import java.util.*;
public class Problem36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> intr=new ArrayList<>();
        while(sc.hasNextInt())
        {
            intr.add(sc.nextInt());
        }
        sum(intr);
    }
    static void sum(ArrayList<Integer> intr)
    {
        int sum=0;
        for(int i=1;i<intr.size();i+=2)
        {
            sum+=intr.get(i);
        }
        System.out.println(sum);
    }
}