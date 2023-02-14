import java.util.*;
public class Problem31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char vowels[]={'a','e','i','o','u','A','E','I','O','U'};
        ArrayList<Integer> intr=new ArrayList<>();
        if(str.length()>12)
        {
            for(int i=0;i<str.length();i++)
            {
                for(int j=0;j<10;j++)
                {
                    if(str.charAt(i)==vowels[j])
                    {
                        intr.add(i);
                    }
                }
            }
        }
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<intr.size();i++)
        {
            int fact=1;
            for(int j=1;j<=intr.get(i);j++)
            {
                fact*=j;
            }
            map.put(intr.get(i),fact);
        }
        System.out.println(map);
    }
}
