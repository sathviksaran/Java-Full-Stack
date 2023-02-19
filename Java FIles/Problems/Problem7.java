
/*Problem 6 using String */

import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check=0;
        while(check!=1)
        {
            System.out.print("Enter a 12 digit number: ");
            String s=sc.next();
            if (s.length()==12)
            {
                check=1;
            }
            if (check==1)
            {
                int oddsum=0,evensum=0;
                for(int i=0;i<s.length();i++)
                {
                    int n=s.charAt(i)-'0';
                    //n=Integer.parseInt(s.valueOf(s.charAt(i)));
                    //n=Character.getNumericValue(s.charAt(i));
                    if (i%2==0)
                    {
                        oddsum+=n;
                    }
                    else{
                        evensum+=n;
                    }
                }
                double fact=1;
                for(int i=1;i<=evensum;i++)
                {
                    fact*=i;
                }
                System.out.println(Math.abs(Math.pow(oddsum,2)-fact)); 
            }
        }      
    }
}
