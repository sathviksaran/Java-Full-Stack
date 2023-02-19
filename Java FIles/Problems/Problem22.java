
/*Take Strings into an array list until user puts an integer and print the index of vowels in each string */


import java.util.*;
public class Problem22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> str=new ArrayList<>();
        LinkedList<LinkedList<Integer>> intr=new LinkedList<>();
        char vowels[]={'a','e','i','o','u'};
        while(!sc.hasNextInt())
        {
            LinkedList<Integer> intr1=new LinkedList<>();
            intr1.clear();
            if(sc.hasNextInt())
            {
                break;
            }
            String str1=sc.nextLine(); 
            char ch[]=str1.toCharArray();
            str.add(str1);
            for(int i=0;i<ch.length;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(ch[i]==vowels[j])
                        intr1.add(i);
                }
            }
            intr.add(intr1);
        }
        System.out.println(str);
        System.out.println(intr);
    }
}