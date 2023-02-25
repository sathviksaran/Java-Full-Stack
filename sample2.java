import java.util.ArrayList;
public class sample2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("racecar");
        words.add("level");
        words.add("hello");
        words.add("world");
        words.add("deified");
        words.stream().filter(word -> word.equals(new StringBuilder(word).reverse().toString())).forEach(System.out::println);
    }
}