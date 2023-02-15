import java.util.*;
public class MatchesProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of teams: ");
        int n=sc.nextInt();
        ArrayList<ArrayList<String>> s=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            ArrayList<String> str=new ArrayList<>();
            str.clear();
            for(int j=i+1;j<=n;j++)
            {
                str.add("Team"+i+" Vs "+"Team"+j);
            }
            s.add(str);
        }
        System.out.println(s);
    }
}
