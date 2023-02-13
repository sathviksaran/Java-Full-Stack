import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d;
        int n,temp,temp1,check=0,sum,nod;
        while(check!=1)
        {
            System.out.println("Enter an armstrong number");
            n=sc.nextInt();
            temp=n;
            temp1=n;
            nod=0;
            sum=0;
            while(n!=0)
            {
                nod++;
                n=n/10;
            }
            while (temp!=0)
            {
                d=temp%10;
                temp=temp/10;
                sum+=Math.pow(d,nod);
            }
            if (temp1==sum)
            {
                check=1;
                System.out.println(temp1+" is an armstrong number");
            }
        }
    }
}