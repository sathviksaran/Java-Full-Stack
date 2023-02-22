public class Encapsulation {
    public static void main(String[] args) {
        class2 c2=new class2("Sathvik","QIS",20);
        System.out.println(c2.getName());
        c2.setName("JKL");
        System.out.println(c2.getName());
    }
}
class class2
{
    private String name;
    private String college;
    private int age;
    class2(String name,String college,int age)
    {
        this.name=name;
        this.college=college;
        this.age=age;
    }
    String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}