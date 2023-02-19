
/*Get the unique characters from the string */

import java.util.*;
public class Problem24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Character> set=new HashSet<>();
        String s=sc.next();
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }
        System.out.println(set);
    }
}