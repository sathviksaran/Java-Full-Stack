
/*Add the elements into the array only if the sum of digits in the number is even and print the array */


import java.util.*;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int a1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element: ");
            a1[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            int n1=a1[i],sum=0;
            while(n1!=0)
            {
                sum+=n1%10;
                n1/=10;
            }
            if(sum%2==0)
            {
                a[j]=a1[i];
                System.out.print(a[j]+" ");
                j++;
            }
        }
    }
}