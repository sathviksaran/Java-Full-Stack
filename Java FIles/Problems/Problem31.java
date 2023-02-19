
/*Input:
 123456
 Output:
 (1^3+3^3+5^3)/(2^2+4^2+6^2)
 */



import java.util.*;
public class Problem31 {
    public static void main(String[] args) {
        result(checkdigits());
    }
    static int checkdigits()
    {
        int check=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        while(check==0)
        {
            int nod=0;
            while(n!=0)
            {
                nod++;
                n/=10;
            }
            if(nod==6)
            {
                check=1;
                break;
            }
            n=sc.nextInt();
        }
        return temp;
    }
    int temp1=checkdigits();
    static void result(int temp1)
    {
        int ref[]=new int[6];
        for(int i=5;i>=0;i--)
        {
            ref[i]=temp1%10;
            temp1/=10;
        }
        double cubesum=0,squaresum=0;
        for(int i=0;i<6;i++)
        {
            if(i%2==0)
            {
                cubesum+=Math.pow(ref[i],3);
            }
            else{
                squaresum+=Math.pow(ref[i],2);
            }
        }
        System.out.println(cubesum/squaresum);
    }
}