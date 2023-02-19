

/*Take Integers into the array list until user enters 4 strings and then print arraylist of integers */



import java.util.*;
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> ref = new ArrayList<Integer>();
        ArrayList <String> s=new ArrayList<String>();
        int count=0;
        while(count<=4)
        {
            if(sc.hasNextInt())
            {
                ref.add(sc.nextInt());
            }
            else
            {
                s.add(sc.nextLine());
                count++;
            }
        }
        System.out.println(ref);
    }
}