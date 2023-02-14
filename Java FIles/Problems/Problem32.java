import java.util.*;
public class Problem32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length()==10)
        {
            for(int i=0;i<10;i++)
            {
                if(map.containsKey(s.charAt(i)))
                {
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
                else{
                    map.put(s.charAt(i),1);
                }
            }
        }
        System.out.println(map);
        char digits[]={'0','1','2','3','4','5','6','7','8','9'};
        for(char c:digits)
        {
            if(!map.containsKey(c))
            {
                System.out.println(c);
                map.put(c,0);
            }
        }
        System.out.println(map);
        System.out.println((int)(Math.random()*10000));
    }
}