public class Encapsulation {
    public static void main(String[] args) {
        Encapsulate c2=new Encapsulate("Sathvik","QIS",20);
        System.out.println(c2.getName());
        c2.setName("JKL");
        System.out.println(c2.getName());
    }
}
class Encapsulate
{
    private String name;
    private String college;
    private int age;
    Encapsulate(String name,String college,int age)
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