
/*Implementation of Constructors */

public class Constructor {
    public static void main(String[] args) {
        Cons1 obj=new Cons1("Sathvik", "White", "Python");
        Cons1 obj1=new Cons1();
        Cons1 obj2=new Cons1("Tanuja", "White", "Python", 19);
        System.out.println(obj.favColor);
        obj.greeting();
        obj.ageAfter13yrs();
    }
}
class Cons1
{
    String name;
    String favColor;
    String favLang;
    int age;
    Cons1()
    {
        System.out.println("Object initialized");
    }
    Cons1(String name,String favColor,String favLang)
    {
        /*Provides null as output*/
        /*name=name;
        favColor=favColor;
        favLang=favLang;*/
        
        /*Use reference keyword this to get the actual output */
        this.name=name;
        this.favColor=favColor;
        this.favLang=favLang;
    }
    Cons1(String name,String favColor,String favLang,int age)
    {
        this.name=name;
        this.favColor=favColor;
        this.favLang=favLang;
        this.age=age;
    }
    
    /*Constructor Methods*/
    void greeting()
    {
        System.out.println("Hello "+this.name);
    }
    void ageAfter13yrs()
    {
        System.out.println(this.age+13);
    }
}