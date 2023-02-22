public class SuperKeyword {
    public static void main(String[] args) {
        PlacedStudents ps=new PlacedStudents("Sathvik", "atchukolus@gmail.com", 2024, "Google");
        System.out.println(ps.name);
    }
}
class UnplacedStudents
{
    String name;
    String email;
    int yearofpassing;
    UnplacedStudents(String name,String email,int yearofpassing)
    {
        this.name=name;
        this.email=email;
        this.yearofpassing=yearofpassing;
    }
}
class PlacedStudents extends UnplacedStudents
{
    String company;
    PlacedStudents(String name,String email,int yearofpassing,String company)
    {
        super(name,email,yearofpassing);
        this.company=company;
    }
}