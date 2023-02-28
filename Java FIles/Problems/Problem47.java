import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Problem47 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("racecar");
        words.add("level");
        words.add("hello");
        words.add("world");
        words.add("deified");
        List<String> result=words.stream().filter(word -> word.equals(new StringBuilder(word).reverse().toString())).collect(Collectors.toList());
        System.out.println(result);
    }
}