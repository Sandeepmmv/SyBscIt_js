interface Shape
{
    double area();
    double perimeter();
}
class Circle implements Shape
{
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double area()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}
public class pra2c
{
    public static void main(String[] args)
    {
        Circle circle=new Circle(10.0);
        System.out.println("circle area:"+ circle.area());
        System.out.println("circle perimeter:"+ circle.perimeter());
    }
}
