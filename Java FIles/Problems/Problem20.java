

/*Pushing static array into dynamic array */

import java.util.*;
public class Problem20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<List> s=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        while(!sc.hasNextInt())
        {
            String str=new String();
            if(sc.hasNextInt())
            {
                a.add(sc.nextInt());
                break;
            }
            else
            {
                str=sc.next();
            }
            List str1=Arrays.asList(str);
            s.add(str1);
        }
        System.out.println(s);
    }
}