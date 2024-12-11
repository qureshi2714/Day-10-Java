
interface mobileapp{
    public void menu();
    public void rating();
    public void contact();
}
class b implements mobileapp
{
    public void menu()
    {
        System.out.println("hello");
    }
    public void rating()
    {
        System.out.println("hello shaik");
    }
    public void contact()
    {
        System.out.println("9898989898");
    }
    public class Interface{
        public static void main(String args[])
        {
            b a=new b();
            a.contact();
        }
    }

}
