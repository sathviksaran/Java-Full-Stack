import java.util.HashSet;

public class Problem40 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        HashSet<String> set1=new HashSet<>();
        set.add("C");
        set.add("Python");
        set.add("Java");
        System.out.println(set);
        set1.addAll(set);
        System.out.println(set1);
        set.remove("Java");
        System.out.println(set);
        System.out.println(set1);
    }
}
