import java.util.*;
public class Problem44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        Child c=new Child(s1);
        System.out.println(c.remove(s1));
    }
}
class Parent
{
    String s;
    static String remove(String s)
    {
        String String1="";
        char vowels[]={'a','e','i','o','u','A','E','I','O','U'};
        char ch[]=s.toCharArray();
        for(char elem:ch)
        {
            int flag=1;
            for(char elem1:vowels)
            {
                if(elem==elem1)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                String1+=elem;
            }
        }
        return String1;
    }
    Parent(String s)
    {
        this.s=remove(s);
    }
}
class Child extends Parent
{
    Child(String s)
    {
        super(s);
    }
}