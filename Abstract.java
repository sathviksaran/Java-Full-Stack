public class Abstract {
    public static void main(String[] args) {
        College coll=new College();
        coll.students();
        AbstractClass abc=new AbstractClass() 
        {
            @Override
            void students()
            {
                System.out.println("HI");
            }
        };
        abc.students();
    }
}

abstract class AbstractClass
{
    abstract void students();
}
class College extends AbstractClass
{
    void students()
    {
        System.out.println("Hello");
    }
}