import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check=0;
        while(check!=1)
        {
            System.out.print("Enter a 12 digit number: ");
            long n=sc.nextLong(),temp=n,nod=0,evensum=0,oddsum=0;
            while(n!=0)
            {
                nod++;
                n=n/10;
            }
            if (nod==12)
            {
                check=1;
            }
            if (check==1)
            {
                for(int i=1;i<=nod;i++)
                {
                    if (i%2==1)
                    {
                        oddsum+=temp/Math.pow(10,nod-i);
                        temp%=Math.pow(10,nod-i);
                    }
                    else{
                        evensum+=temp/Math.pow(10,nod-i);
                        temp%=Math.pow(10,nod-i);
                    }
                }
                System.out.println(evensum);
                System.out.println(oddsum);
                double fact=1;
                for(int i=1;i<=evensum;i++)
                {
                    fact*=i;
                }
                System.out.println((Math.abs(Math.pow(oddsum,2)-fact)));
            }
        }
    }
}