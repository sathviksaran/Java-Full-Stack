import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*int a=sc.nextInt(),b=sc.nextInt();
        System.out.println((int)(Math.pow(Math.abs(b-a),b%10)));
        System.out.println(Math.cbrt(b%10));*/
        /*String month="February";
        switch(month)
        {
            case "January":
                System.out.println("The month is January");
                break;
            case "February":
                System.out.println("The month is February");
                break;
            case "March":
                System.out.println("The month is March");
                break;
            default:
                System.out.println("Its not a valid month");
        }*/
        int n=sc.nextInt();
        switch(n)
        {
            case 0:
                System.out.println("The day is Sunday");
                break;
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            default:
                System.out.println("Enter valid input");
        }
    }
}
