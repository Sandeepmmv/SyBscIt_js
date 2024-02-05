abstract class Shape
{
    public abstract double area();
}
class Circle extends Shape
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
}
public class pra2b
{
    public static void main(String[] args)
    {
        Circle circle=new Circle(10.0);
        System.out.println("Circle Area:"+circle.area());
    }
}