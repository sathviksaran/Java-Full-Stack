import protected1.*;
//public class ProtectedPackage{
public class ProtectedPackage extends Protected{
    public static void main(String[] args) {
        ProtectedPackage p1=new ProtectedPackage();
        p1.greet("Sathvik");
        Protected obj=new Protected();
        //obj.greet("Sathvik");         //Error
    }
}