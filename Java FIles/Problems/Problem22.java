import java.util.*;
public class Problem22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList <String> ref=new LinkedList<>();
        while(!sc.hasNextInt())
        {
            if(sc.hasNextInt())
            {
                break;
            }
            String str=sc.nextLine(); 
            str=str.replace('a','#');
            str=str.replace('e','#');
            str=str.replace('i','#');
            str=str.replace('o','#');
            str=str.replace('u','#');
            str=str.replace('A','#');
            str=str.replace('E','#');
            str=str.replace('I','#');
            str=str.replace('O','#');
            str=str.replace('U','#');
            ref.add(str);
        }
        Object a[]=ref.toArray();
        for(Object elem:a)
        {
            System.out.println(elem+" ");
        }
    }
}
