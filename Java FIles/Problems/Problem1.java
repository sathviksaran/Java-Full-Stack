
/*Write a program which terminates until user enters a factorial number, if user enters a factorial number print the number to which the given number is factorial */


import java.util.*;
public class Problem1 {                                                 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,fact,check=0,n=sc.nextInt();
        while(check==0)
        {
            i=1;
            fact=1;
            for(i=1;i<=n;i++)
            {
                fact*=i;
                if (fact==n)
                {
                    check=1;
                    break;
                }
            }
            if (check==1)
            {
                System.out.println(n+" is a factorial of "+i);
            }
            else
            {
                System.out.println("Enter a factorial number");
                n=sc.nextInt();
            }
        }
    }
}