
/*Take Strings into an ArrayList until user puts an integer and print ArrayList of hashmaps containing characters and their no.of occurences of each string */



import java.util.*;
public class Problem35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<HashMap<Character,Integer>> li=new ArrayList<>();
        ArrayList<String> s=new ArrayList<>();
        while(!sc.hasNextInt())
        {
            s.add(sc.next());
        }
        for(int i=0;i<s.size();i++)
        {
            HashMap<Character,Integer> map=new HashMap<>();
            map.clear();
            String str=s.get(i);
            char ch[]=str.toCharArray();
            for(int j=0;j<ch.length;j++)
            {
                if(map.containsKey(ch[j]))
                {
                    map.put(ch[j],map.get(ch[j])+1);
                }
                else
                {
                    map.put(ch[j],1);
                }
            }
            li.add(map);
        }
        System.out.println(li);
    }
}