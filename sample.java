import java.util.ArrayList;
public class sample {
    public static void main(String[] args) {
        ArrayList<Integer> intr=new ArrayList<>();
        intr.add(23);
        intr.add(34);
        intr.add(44);
        intr.forEach((elem)->{
            System.out.println(elem);
        });
    }
}