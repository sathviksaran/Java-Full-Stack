import java.util.*;
public class Problem20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        while(sc.hasNextInt())
        {
            ArrayList<Integer> b=new ArrayList<>();
            b.clear();
            int n=sc.nextInt();
            b.add(n);
            b.add(n*n*n);
            a.add(b);
        }
        System.out.println(a);
    }
}