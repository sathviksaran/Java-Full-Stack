import java.util.*;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check=0;
        while(check!=1)
        {
            System.out.print("Enter a palindrome number: ");
            String s=sc.next();
            String s1="";
            for (int i=s.length()-1;i>=0;i--)
            {
                s1+=s.charAt(i);
            }
            if (s.equals(s1))
            {
                check=1;
            }
        }
    }
}
