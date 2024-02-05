class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
}
public class pra3b
{
    public static void main(String[] args)
    {
        try
        {
            int age=-20;
            if(age<0)
            {
                throw new CustomException("Age cannot be negative.");
            }
            System.out.println("Age:"+age);
        }
        catch(CustomException e)
        {
            System.err.println("Error:"+ e.getMessage());
        }
    }
}