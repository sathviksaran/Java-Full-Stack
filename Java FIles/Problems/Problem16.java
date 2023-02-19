
/* Input:
A
25 
14
8
B
Tanuja
Sathvik
Srujana
end
Output:
[25, 14, 8]
[Tanuja, Sathvik, Srujana] */





import java.util.*;
public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<String> b=new ArrayList<String>();
        String s="";
        while(!s.equalsIgnoreCase("end"))
        {
            s=sc.next();
            while((s.equalsIgnoreCase("A")) &&(sc.hasNextInt()))
            {
                a.add(sc.nextInt());
            }
            while((s.equalsIgnoreCase("B")) &&(sc.hasNext()))
            {
                String s1=sc.next();
                if(!s1.equalsIgnoreCase("end"))
                {
                    b.add(s1);
                }
                else{
                    s="end";
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
