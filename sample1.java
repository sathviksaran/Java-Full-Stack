import java.util.ArrayList;
import java.util.stream.Collectors;
public class sample1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        ArrayList<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Sorted numbers: " + sortedNumbers);
    }
}