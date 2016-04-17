package alex.arden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test
{
    static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    static String[] strList = new String[1000];
    static int strCount = 0;

    public static void main(String[] args) throws IOException
    {
        EnterStringArray();
        ShowStringArray();
    }

    public static void EnterStringArray() throws IOException {

        System.out.printf("Please enter the string %d", 1);
        System.out.println();
        strList[0] = stdIn.readLine();
        strCount = 1;
        do
        {
            System.out.printf("Please enter the string %d. If you do not want more strings, just press Enter.", strCount+1);
            java.lang.String S = stdIn.readLine();
            if (S.length() == 0) break;
            strList[strCount] = S;
            strCount++;
        } while (true);
    }

    public static void ShowStringArray() throws IOException
    {
        java.lang.String answer = "";
        do
        {
            System.out.println("Please choose the number of string you want to see now");
            try
            {
                int j = Integer.parseInt(stdIn.readLine());
                j--;
                if (j>strCount)
                {
                    System.out.println("The number is more than the max number of string you have written. Please write the less number or fuck off.");
                }
                else if (j<0)
                {
                    System.out.println("There cannot be numbers less than zero. Please write positive or fuck off.");
                }
                else
                {
                    System.out.println(strList[j]);
                    System.out.println("Do you want to continue? (Y/N)");
                    answer = stdIn.readLine();
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please write the number which is more than 0 and not more than number of saved strings");
            }
        } while (answer.equals("Y"));
    }
}
