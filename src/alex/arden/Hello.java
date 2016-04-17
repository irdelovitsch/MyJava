package alex.arden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello
{
    static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        double a;
        double b;
        double c;
        double d;
        java.lang.String answer;
        do {
            System.out.println("Please write your coefficients for equation ax^2 + bx + c");
            System.out.println("Please write coefficient a");
            a = Coefficient();

            System.out.println("Please write coefficient b");
            b = Coefficient();

            System.out.println("Please write coefficient c");
            c = Coefficient();


            if (a == 0) {
                System.out.println();
                System.out.printf("%.1fx + %.1f = 0", b, c);
                System.out.println();
                System.out.println("There is linear equation. x = " + c / b);
            } else {
                d = MyMath.Disc(a, b, c);
                System.out.println("Your discriminant is " + d);
                if (d < 0) {
                    System.out.println();
                    System.out.printf("%.1fx^2 + %.1fx + %.1f = 0", a, b, c);
                    System.out.println();
                    System.out.println("There are no real roots!");
                } else if (d == 0) {
                    double x = -b / (2 * a);
                    System.out.println();
                    System.out.printf("%.1fx^2 + %.1fx + %.1f = 0", a, b, c);
                    System.out.println();
                    System.out.println("There are one real root");
                    System.out.println("x = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println();
                    System.out.printf("%.1fx^2 + %.1fx + %.1f = 0", a, b, c);
                    System.out.println();
                    System.out.println("There are two real roots");
                    System.out.println("x1 = " + x1);
                    System.out.println("x1 = " + x2);
                }
            }
            System.out.println();
            System.out.println("Do you want to resolve one more equation? (Y/N)");
            answer = stdIn.readLine();
        } while (answer.equals("Y"));
    }

    static double Coefficient() throws  IOException
    {
        double q = 0;
        boolean isNumber;
        do {
            try {
                q = Double.parseDouble(stdIn.readLine());
                isNumber = true;
            }
            catch (NumberFormatException e) {
                System.out.println("You haven't written the number. Please write a number");
                isNumber = false;
            }
        } while (!isNumber);
        return q;
    }
}