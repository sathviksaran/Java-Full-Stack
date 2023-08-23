package Problems;

import java.util.ArrayList;
import java.util.*;
public class Problem52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ArrayList<String> str = new ArrayList<>();
        while(!sc.hasNextInt())
        {
            String s=sc.next();
            str.add(s);
        }
        for (int i = str.size()-1; i >= 0; i--) {
            System.out.print(str.get(i)+" ");
        }
    }
}
