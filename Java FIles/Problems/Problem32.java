
/*Factorial and binary equivalent of a number using functions */


import java.util.*;
public class Problem32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="";
        System.out.print("Enter number:");
        int n=sc.nextInt();
        System.out.print("Factorial/Binary? ");
        String s=sc.next();
        s1=sc.next();
        if(!s1.equalsIgnoreCase("end")){
            hello(n,s,s1);
        }
        else
        {
            if(s.equalsIgnoreCase("factorial"))
            {
                fact(n,s);
            }
            if(s.equalsIgnoreCase("binary"))
            {
                binary(n,s);
            }
        }
    }
    static void fact(int n,String s)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    }
    static void binary(int n,String s)
    { 
        String bin=Integer.toBinaryString(n);
        System.out.println(bin);
    }
    static void hello(int n,String s,String s1)
    {
        System.out.println("Only 2 parameters are allowed");
    }
}