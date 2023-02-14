import java.util.*;
public class Problem30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        char ch[]={'0','1','2','3','4','5','6','7','8','9'};
        HashMap<Character,String> map=new HashMap<>();
        String s1=sc.next();
        for(int i=0;i<10;i++)
        {
            map.put(ch[i],str[i]);
        }
        for(int i=0;i<s1.length();i++)
        {
            System.out.print(map.get(s1.charAt(i))+" ");
        }
    }
}