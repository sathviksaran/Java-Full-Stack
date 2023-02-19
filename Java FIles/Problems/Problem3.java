

/*Implementation of nested for loop */


import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int a=sc.nextInt();
        System.out.print("Enter no.of columns: ");
        int b=sc.nextInt();
        System.out.print("Enter a Symbol: ");
        String c=sc.next();
        for(int i=1;i<=a;i++)
        {
            System.out.println("");
            for(int j=1;j<=b;j++)
            {
                System.out.print(c);
            }
        }
    }
}
