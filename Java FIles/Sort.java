import java.util.*;
public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(232);
        a.add(89);
        a.add(92);
        Collections.sort(a);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
        Iterator it=a.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
