
/*Implementation of hashset and converting removing duplcates from arraylist */


import java.util.*;
public class Problem23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> s=new ArrayList<>();
        ArrayList<Integer> i=new ArrayList<>();
        while(sc.hasNext())
        {
            if(sc.hasNextInt())
            {
                i.add(sc.nextInt());
                break;
            }
            s.add(sc.next());
        }
        HashSet<String> set=new HashSet<>(s);
        System.out.println(set);
    }
}
