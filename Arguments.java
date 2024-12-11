public class Arguments {
    String name;
    Arguments(String name)
    {
        this.name=name;
    }
    void dis1() 
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teacher(this);
    }
    public static void main(String args[]){
        Arguments o=new Arguments("Shaik");
        o.agt();
    }
}
class teacher {
    public void teacher (Arguments s)
    {
        s.dis1();
    }
}
