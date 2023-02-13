import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check=0;
        while(check!=1)
        {
            System.out.print("Enter number containing digits multiple of 3: ");
            String s=sc.next();
            if (s.length()%3==0)
            {
                check=1;
            }
            if (check==1)
            {
                int a[]=new int[s.length()];
                for(int i=0;i<s.length();i++)
                {
                    a[i]=s.charAt(i)-'0';
                }
                double sum=0;
                for(int i=0;i<s.length();i+=3)
                {
                    sum+=(Math.pow(a[i],Math.pow(a[i+1],a[i+2])));
                }
                System.out.println(sum);
            }
        } 
    }
}