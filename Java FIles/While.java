
/*Write a program which terminates until user enters a perfect cube number */


import java.util.*;
public class While {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double res=Math.cbrt(n);
        while(res!=(int)res)
        {
            System.out.println("Enter perfect cube number");
            n=sc.nextDouble();
            res=Math.cbrt(n);
        }
        System.out.println("You entered a perfect cube number!!!!");
    }
}