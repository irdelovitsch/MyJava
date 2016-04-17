package alex.arden;

/**
 * Created by Sasha on 3/20/2016.
 */
public class Test2
{
    public static void main(String[] args)
    {
        double A = 0;
        boolean isNumber = true;
        try
        {
            A = Double.parseDouble("Alex");
        }
        catch(NumberFormatException e)
        {
            isNumber = false;
        }
        if (isNumber == true)
        {
            System.out.println("You have written the number " + A);
        }
        else
        {
            System.out.println("You haven't written the number!");
        }
    }
}
