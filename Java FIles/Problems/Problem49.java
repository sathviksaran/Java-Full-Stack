import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Problem49 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        List<Integer>factorial=numbers.stream().map(number -> {
            return fact(number);
        }).collect(Collectors.toList());
        System.out.println(factorial);
    }
    static int fact(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact*=i;
        }
        return fact;
    }
}