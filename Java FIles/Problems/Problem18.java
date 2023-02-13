import java.util.*;
public class Problem18 {
    public static void main(String[] args) {
        /*int a[]=new int[3];
        a[0]=20;
        a[1]=30;
        a[2]=40;
        System.out.println(a);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);*/


        /*ArrayList <String> str=new ArrayList<String>();
        str.add("C");
        str.add("C++");
        str.add("Python");
        str.add("Java");
        str.add("Ruby");
        System.out.println(str);
        System.out.println(str.size());
        System.out.println(str.get(1));
        System.out.println(str.get(1).indexOf("+"));
        str.set(str.indexOf("Java"),"Java Script");
        System.out.println(str);
        str.remove("Java Script");
        System.out.println(str);*/


        //String methods
        /*System.out.println("hello".charAt(0));
        System.out.println("hello".indexOf("l"));
        System.out.println("hello".replaceFirst("l", "*"));*/


        ArrayList<ArrayList <String>> ref = new ArrayList<>();
        ArrayList<String> str1=new ArrayList<>();
        str1.add("Apple");
        str1.add("Orange");
        str1.add("Banana");
        ArrayList<String> str2=new ArrayList<>();
        str2.add("Carrot");
        str2.add("Potato");
        str2.add("Onion");
        ref.add(str1);
        ref.add(str2);
        System.out.println(ref);
        String g=ref.get(0).get(0).replaceFirst("A", "O");
        str1.set(0,g);
        System.out.println(str1);
        System.out.println(ref);
    }
}
