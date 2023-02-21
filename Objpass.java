import java.util.*;
public class Objpass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        House house1=new House(3000,5000);
        House house2=new House(4000,5500);
        House house3=new House(5000,8000);
        RealEstate re=new RealEstate();
        System.out.print("Enter no.of houses you want to buy: ");
        int n=sc.nextInt();
        if(n==1)
        {
            re.buy(house1);
        }
        else if(n==2)
        {
            re.buy(house1, house2);
        }
        else
        {
            re.buy(house1,house2);
        }
        System.out.println(House.numofhouses);
    }
}
class House
{
    int cost,rent;
    static int numofhouses;
    House(int cost,int rent)
    {
        this.cost=cost;
        this.rent=rent;
        numofhouses++;
    }
}
class RealEstate
{
    static void buy(House house1)
    {
        System.out.println("Cost of house1: "+house1.cost);
        System.out.println("Rent of house1: "+house1.rent);
    }
    static void buy(House house1,House house2)
    {
        System.out.println("Cost of house1 and house2: "+(house1.cost+house2.cost)*0.9);
        System.out.println("Rent of house1 and house2: "+(house1.rent+house2.rent)*1.1);
    }
    static void buy(House house1,House house2,House house3)
    {
        System.out.println("Cost of house1,house2 and house3: "+(house1.cost+house2.cost+house3.cost)*0.85);
        System.out.println("Rent of house1,house2 an house3: "+(house1.rent+house2.rent+house3.rent)*1.15);
    }
}