import java.util.*; 
public class Logical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mileage=sc.nextInt(),budget=sc.nextInt();
        if ((mileage>50) && (budget<50000))
        {
            System.out.println("Get a motorcycle");
        }
        else
        {
            System.out.println("Get a bus");
        }
    }
}