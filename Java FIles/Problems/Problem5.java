import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int check=0;
        while(check!=1)
        {
            System.out.println("Enter an 6 digit number: ");
            int n=sc.nextInt(),temp=n,nod=0;
            while(temp!=0)
            {
                nod++;
                temp/=10;
            }
            if(nod==6)
            {
                check=1;
            }
            while((check==1)&&(n!=0))
            {
                for(int i=0;i<nod;i++)
                {
                    double dig=n%10;
                    n=n/10;
                    if((i%2==0) && (dig%2==0))
                    {
                        System.out.println(Math.pow(dig,3));
                    }
                    if((i%2!=0) && (dig%2!=0))
                    {
                        System.out.println(Math.sqrt(dig));
                    }
                }
            }
        }
    }
}