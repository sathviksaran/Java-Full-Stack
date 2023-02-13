import java.util.*;
public class Problem28 {
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
        //HashMap<String,Integer> map1=new HashMap<>();
        Collections.sort(s);
        for(String str:s)
        {
            System.out.println("Key="+str+" "+"Value="+map.get(str));
        }
    }
}