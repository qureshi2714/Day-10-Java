public class Constructoroverloading {
    String name;
    Constructoroverloading()
    {
        name="muskan";
    }
    Constructoroverloading(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[]){
        Constructoroverloading o = new Constructoroverloading();
        o.display();
        Constructoroverloading o1=new Constructoroverloading("Shaik");
        o1.display();
    }
    
    
}
