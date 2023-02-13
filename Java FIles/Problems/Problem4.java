import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int check=0;
        while(check!=1)
        {
            System.out.println("Enter an 8 digit number: ");
            int n=sc.nextInt(),temp=n,nod=0;
            while(temp!=0)
            {
                nod++;
                temp/=10;
            }
            if(nod==8)
            {
                check=1;
            }
            while((n!=0)&&(check==1))
            {
                int i=1;
                double dig=n%10;
                n=n/10;
                if(i%2==0)
                {
                    System.out.println(Math.cbrt(dig));
                }
                else
                {
                    int fact=1;
                    for(int j=1;j<=dig;j++)
                    {
                        fact*=j;
                    }
                    System.out.println(fact);
                }
                i++;
            }
        }
    }
}
