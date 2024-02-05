class DemoStaticMethods
{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
}
public class pra1c
{
    public static void main(String[] args)
    {
        int sum = DemoStaticMethods.add(8,4);
        int diff = DemoStaticMethods.sub(7,6);

        System.out.println("Sum:"+sum);
        System.out.println("Sub integers:"+diff);


    }
}