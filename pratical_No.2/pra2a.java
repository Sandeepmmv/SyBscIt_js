class A
{
    void show()
    {
        System.out.println("Base Class");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("Derived Class");
    }
}
class pra2a
{
    public static void main(String args[])
    {
        B s=new B();
        s.show();
    }
}