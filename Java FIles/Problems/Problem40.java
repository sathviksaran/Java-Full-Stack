import java.util.*;
public class Problem40{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        String s="";
        while(!s.equalsIgnoreCase("end"))
        {
            s=sc.next();
            if(!s.equalsIgnoreCase("end"))
            {
                int n=sc.nextInt();
                if(map.containsKey(s))
                {
                    map.put(s,map.get(s)+n);
                }
                else
                {
                    map.put(s,n);
                }
            }
        }
        System.out.println(map);
    }
}