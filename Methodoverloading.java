class Methodoverloading {
    static void a()
    {
        System.out.println("Hello");
    }
    static void a(int b)
    {
        System.out.println("Hello"+b);
    }
    static void a(int b,int c)
    {
        System.out.println("Hello"+b+" "+c);
    }
    public static void main(String args[]){
        a();
        a(6);
        a(45);
    }
        
}
