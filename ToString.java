

/*toString() implementation */

public class ToString {
    public static void main(String[] args) {
        toStringjava obj=new toStringjava();
        System.out.println(obj.toString());
    }
}
class toStringjava
{
    String name="Java";
    int op=789;
    public String toString(){
        return name+"\n"+op+"\n"+"Python";
    }
}