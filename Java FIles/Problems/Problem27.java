import java.util.*;
public class Problem27 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Java", 234);
        map.put("Python",34);
        map.put("C++",67);
        System.out.println(map);
        map.put("Python",456);
        System.out.println(map);
        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}