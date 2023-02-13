import java.util.*;
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int a[]=new int[n];
        int a1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element: ");
            
            sum+=a1[i];
        }
        for(int i=0;i<n;i++)
        {
            if(sum%2==0)
            {
                a[i]=a1[i];
            }
            System.out.print(a[i]+" ");
        }
    }
}