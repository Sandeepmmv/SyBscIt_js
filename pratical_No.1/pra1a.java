class MyClass
{
    private int a;
    public MyClass()
    {
        System.out.println("Default Constructor");
    }
    public MyClass(int value)
    {
        a=value;
        System.out.println("Parameterized Constructor and value is:"+a);
    }
    public MyClass(MyClass other)
    {
        a = other.a;
        System.out.println("Copy Constructor and value"+a);
    }
}
public class pra1a
{
    public static void main(String[] args)
    {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(7);
        MyClass obj3 = new MyClass(obj2);

    }
}