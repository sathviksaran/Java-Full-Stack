
/*Take Strings and Integers as input and print sorted hashmap with the taken input */


import java.util.*;
public class Problem26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> s=new ArrayList<>();
        ArrayList<Integer> intr=new ArrayList<>();
        while(true)
        {
            if(sc.hasNextInt())
            {
                intr.add(sc.nextInt());
            }
            if(sc.hasNext())
            {
                String str=sc.next();
                if(!str.equalsIgnoreCase("Break"))
                {
                    s.add(str);
                }
                else{
                    break;
                }
            }
        }
        HashMap<String,Integer> map=new HashMap<>();
        if(s.size()<=intr.size())
        {
            for(int i=0;i<s.size();i++)
            {
                map.put(s.get(i),intr.get(i));
            }
        }
        System.out.println(map);
        Collections.sort(s);
        for(String str:s)
        {
            System.out.println("Key="+str+" "+"Value="+map.get(str));
        }
    }
}