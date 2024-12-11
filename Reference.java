public class Reference {
    void display()
    {
        System.out.println("Hello Students");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String args[]){
        Reference o= new Reference();
        o.dis1();
    }
    
}
