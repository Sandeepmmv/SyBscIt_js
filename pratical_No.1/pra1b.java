class OperOver
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class pra1b
{
    public static void main(String[] args)
    {
        OperOver obj= new OperOver();
        int sum1=obj.add(5,10);
        int sum2=obj.add(5,10,15);

        System.out.println("Sum of two integers:"+sum1);
        System.out.println("Sum of three integers:"+sum2);


    }
}