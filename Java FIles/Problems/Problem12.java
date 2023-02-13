import java.util.*;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 10 digit number: ");
        String s=sc.next();
        long sum=0;
        for(int i=0;i<10;i+=2)
        {
            double m=(double)(s.charAt(i)-'0');
            double n=(double)(s.charAt(i+1)-'0');
            long fact=1;
            for(int j=1;j<=(int)(Math.pow(m,n));j++)
            {
                fact*=j;
            }
            sum+=fact;
        }
        System.out.println(sum);
    }
}