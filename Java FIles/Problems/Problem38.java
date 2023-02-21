import java.util.*;
public class Problem38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char vowels[]={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<n;i++)
        {
            int count=0;
            String s=sc.next();
            char ch[]=s.toCharArray();
            for(int j=0;j<10;j++)
            {
                for(int k=0;k<s.length();k++)
                {
                    if(ch[k]==vowels[j])
                    {
                        count++;
                        break;
                    }
                }
            }
            if(count>=2)
            {
                Demo obj=new Demo(s);
            }
        }
        System.out.print("No.of Objects created: "+Demo.NoOfObjects);
    }
}
class Demo
{
    String s;
    static int NoOfObjects;
    Demo(String s)
    {
        this.s=s;
        NoOfObjects++;
    }
}