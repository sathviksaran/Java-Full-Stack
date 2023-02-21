public class Inheritance {
    public static void main(String[] args) {
        Tower t1=new Tower();
        System.out.println(t1.floors);
        t1.maker();
    }
}
class Building
{
    int floors=40;
    static void maker()
    {
        System.out.println("This machine makes tall buildings");
    } 
}
class Tower extends Building
{
    int floors=67;
    static void maker()
    {
        System.out.println("This machine makes tall towers");
    }
}