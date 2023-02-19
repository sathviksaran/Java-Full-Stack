
/*Implementation of 2D array */
/*Take 3 digit number as input and print a 2D array containing 3 rows in which each row represents a digit, its factorial and square root */


import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int check=0;
        while(check!=1)
        {
            System.out.print("Enter a 3 digit number: ");
            String s=sc.next();
            if (s.length()==3)
            {
                check=1;
            }
            if (check==1)
            {
                double a[][]=new double[3][3];
                for(int i=0;i<3;i++)
                {
                    a[i][0]=s.charAt(i)-'0';
                    double fact=1;
                    for(int j=1;j<=a[i][0];j++)
                    {
                        fact*=j;
                    }
                    a[i][1]=fact;
                    a[i][2]=Math.pow(a[i][0],0.5);
                    System.out.print(a[i][0]+" "+a[i][1]+" "+a[i][2]);
                    System.out.println();
                }
            }
        }
    }
}