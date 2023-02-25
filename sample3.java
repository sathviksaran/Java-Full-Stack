import java.util.ArrayList;
import java.util.stream.Collectors;
public class sample3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        ArrayList<Integer> transformedNumbers = numbers.stream().map(number -> {
                if (number % 2 == 0) 
                {
                    return (int) Math.pow(number, 3);
                } 
                else 
                {
                    return (int) Math.pow(number, 2);
                }
            }).collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("Transformed numbers: " + transformedNumbers);
    }
}