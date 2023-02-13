import java.util.*;
public class Problem19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<ArrayList <String>> ref=new ArrayList<>();
        while(!sc.hasNextInt())
        {
            ArrayList<String> s=new ArrayList<>();
            s.clear();
            if(sc.hasNextInt())
            {
                a.add(sc.nextInt());
                break;
            }
            while(s.size()<3)
            {
                if(!sc.hasNextInt())
                {
                    String str=sc.nextLine();
                    str=str.replace('a','$');
                    str=str.replace('e','$');
                    str=str.replace('i','$');
                    str=str.replace('o','$');
                    str=str.replace('u','$');
                    str=str.replace('A','$');
                    str=str.replace('E','$');
                    str=str.replace('I','$');
                    str=str.replace('O','$');
                    str=str.replace('U','$');
                    s.add(str);
                }
                else
                {
                    break;
                }
            }
            ref.add(s);
        }
        System.out.println(ref);   
    }
}