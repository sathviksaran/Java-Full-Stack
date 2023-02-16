import java.util.*;
public class Problem38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of teams: ");
        int n=sc.nextInt();
        System.out.println("Enter teams: ");
        ArrayList <String> teams=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            teams.add(sc.next());
        }
        System.out.println(teams);
        ArrayList<ArrayList<String>> matches=new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                ArrayList<String> str=new ArrayList<>();
                str.clear();
                str.add(teams.get(i)+" Vs "+teams.get(j));
                matches.add(str);
            }
        }
        System.out.println(matches);
    }
}
