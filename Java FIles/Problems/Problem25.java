import java.util.*;
public class Problem25 {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(23);
        set1.add(45);
        set1.add(78);
        HashSet<Integer> set2=new HashSet<>();
        set2.add(14);
        set2.add(8);
        set2.add(25);
        set2.add(78);
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
