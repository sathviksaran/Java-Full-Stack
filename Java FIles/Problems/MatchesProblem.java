import java.util.*;
public class MatchesProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>teams=new ArrayList<>();
        ArrayList<Object>obj=new ArrayList<>();
        ArrayList<HashMap<String,String>>hs=new ArrayList<>();
        teams.add("team1");
        teams.add("team2");
        teams.add("team3");
        teams.add("team4");
        teams.add("team5");
        match m1=new match(teams.get(0));
        match m2=new match(teams.get(1));
        match m3=new match(teams.get(2));
        match m4=new match(teams.get(3));
        match m5=new match(teams.get(4));
        obj.add(m1);
        obj.add(m2);
        obj.add(m3);
        obj.add(m4);
        obj.add(m5);
        new match(obj);
    }
}
    class match
    {
        String s;
        match(String s)
        {
            this.s=s;
        }
        public String toString()
        {
            return s;
        }
        match(ArrayList<Object> obj)
        {
        for(int i=0;i<=obj.size()-1;i++)
        {
            for(int j=0;j<obj.size()/2;j++)
            {   
                int t1=(i+j)%(obj.size()-1);
                int t2=(obj.size()-1-j+i)%(obj.size()-1);
                if(j==0)
                {
                    t2=obj.size()-1;
                }
                System.out.println(obj.get(t1)+" vs "+obj.get(t2));
            }
        }
    }
}