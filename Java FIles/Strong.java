

/*Write a program which terminates until user enters a strong number */

import java.util.*;
public class Strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp,fact,dig,sum=0,n=sc.nextInt();
        while(n!=0)
        {
            temp=n;
            dig=n%10;
            n=n/10;
            fact=1;
            for(int i=1;i<=dig;i++)
            {
                fact*=i;
            }
            sum+=fact;
            if (sum==temp)
            {
                System.out.println(temp+" is a Strong number");
                break;
            }
            else
            {
                System.out.println("Please Enter a Strong number!!!!!");
                n=sc.nextInt();
                sum=0;
            }
        }
    }
}