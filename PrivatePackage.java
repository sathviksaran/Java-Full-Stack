import private1.*;
//public class PrivatePackage extends PrivateExample{         //Error
public class PrivatePackage{
    public static void main(String[] args) {
        PrivatePackage p1=new PrivatePackage();
        //System.out.println(p1.a);                      //Error
        //p1.greet("Sathvik");                         //Error
        //PrivateExample obj=new PrivateExample();       //Error
    }
}