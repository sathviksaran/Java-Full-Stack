import java.util.*;
public class Problem39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        ArrayList<Character> ch=new ArrayList<>();
        if(n.length()==12)
        {
            int i=1,n1;
            ch.add(n.charAt(0));
            if(n.charAt(11)==n.charAt(10))
            {
                n1=11;
            }
            else{
                n1=12;
            }
            while(ch.size()!=n1)
            {
                if(n.charAt(i)==n.charAt(i-1))
                {
                    char temp=n.charAt(i);
                    ch.add(n.charAt(i+1));
                    i+=2;
                    ch.add(temp);
                }
                else{
                    ch.add(n.charAt(i));
                    i+=1;
                }
            }
            System.out.println(ch);
        }
    }
}
