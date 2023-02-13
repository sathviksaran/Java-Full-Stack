import java.util.*;
public class For {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1,check=0,fact=1,n=sc.nextInt();
        while(check==0)
        {
            i=1;
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
                break;
            }
            else{
                System.out.println("Enter a perfect factorial number: ");
                n=sc.nextInt();
                fact=1;
            }
        }
    }
}