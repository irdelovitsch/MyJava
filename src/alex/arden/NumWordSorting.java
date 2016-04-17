package alex.arden;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumWordSorting
{
    static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    static double[] NumberList = new double[100];
    static String[] WordList = new  String[100];
    static int n=0,w=0;

    public static void main(String[] args) throws IOException
    {
        String[] UnsortedA = ReadThis();
        NumbersOrWords(UnsortedA);
        Arrays.sort(NumberList);
        StringsOUT();
    }

    static String[] ReadThis() throws IOException
    {
        String s;
        System.out.println("Please write the list of words and numbers. Separate them with spaces.");
        s = stdIn.readLine();
        return s.split(" ");
    }

    static void NumbersOrWords(String[] parts) throws IOException
    {
        for (String item:parts) {
            try
            {
                NumberList[n] = Double.parseDouble(item);
                n++;
            }
            catch (NumberFormatException e)
            {
                WordList[w] = item;
                w++;
            }
        }
    }
    static void StringsOUT() throws IOException
    {
        System.out.println("See your sorted numbers and words.");
        stdIn.readLine();
        System.out.print("Words: ");
        WordOUT();
        System.out.println("Numbers: ");
        NumOUT();
    }

    static void NumOUT()
    {
        for (int i=0; i<n; i++)
        {
            System.out.println(NumberList[i]);
        }
    }

    static  void WordOUT()
    {
        for (int i=0; i<w; i++)
        {
            System.out.println(WordList[i]);
        }
    }

}
