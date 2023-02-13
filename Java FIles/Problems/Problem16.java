import java.util.*;
public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        while(sc.hasNextInt())
        {
            int n=sc.nextInt(),temp,dig=0,count=0;
            temp=n;
            while(n!=0)
            {
                dig=n%10;
                n=n/10;
                if(dig==0)
                {
                    count++;
                }
            }
            if ((temp%10==0) &&(count<=5) &&(count>2))
            {
                a.add(temp);
            }
            else{
                break;
            }
        }
        System.out.println(a);
    }
}
