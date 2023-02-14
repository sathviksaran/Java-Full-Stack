import java.util.*;
public class Problem30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> intr=new ArrayList<>();
        ArrayList<String> s=new ArrayList<>();
        String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<10;i++)
        {
            s.add(str[i]);
        }
        HashMap<Integer,String> map=new HashMap<>();
        int n=sc.nextInt();
        while(n!=0)
        {
            int dig=n%10;
            n=n/10;
            intr.add(dig);
        }
        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println(map);
    }
}
