import java.util.ArrayList;
public class Problem51 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        int sum=numbers.stream().reduce(0, (a,b)->a+b);
        System.out.println(sum);
    }
}