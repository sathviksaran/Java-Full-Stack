
/*Array of COnstructorized objects */

public class arrofobj {
    public static void main(String[] args) {
        Shopp[] ref=new Shopp[3];
        Shopp refg=new Shopp("Shampoo");
        Shopp refg1=new Shopp("Groceries");
        Shopp refg2=new Shopp("Books");
        ref[0]=refg;
        ref[1]=refg1;
        ref[2]=refg2;
        for(int i=0;i<3;i++)
        {
            System.out.println(ref[i].shoppingitems);
        }
    }
}
class Shopp
{
    String shoppingitems;
    Shopp(String shoppingitems)
    {
        this.shoppingitems=shoppingitems;
    }
}