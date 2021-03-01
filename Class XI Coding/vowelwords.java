/*Write a program to find the words beginning/ending with vowel
and move them to the beginning of the sentence*/
import java.util.*;
class vowelwords
{
    boolean vowel(String w)
    {
        int a = w.length();
        char ch1 = w.charAt(0), ch2 = w.charAt(a-1);
        if((ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U') && 
        (ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U'))
        {
            return true;

        }
        else
            return false;
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        vowelwords ob = new vowelwords();
        System.out.println("Enter the string");
        String s = in.nextLine();
        s = s.toUpperCase();
        int  l = s.length();
        char ch = s.charAt(l-1);
        if (ch!='!'&&ch!='?'&&ch!='.')
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        StringTokenizer str = new StringTokenizer(s," .?!");
        int x = str.countTokens();
        int c = 0;
        String w="",a="",b="";
        for (int i=1;i<=x;i++)
        {
            w = str.nextToken();

            if(ob.vowel(w))
            {
                c++;
                a = a + w + " ";
            }
            else
                b = b + w + " ";

        }
        System.out.println("Number of words beginning and ending with vowel: "+c);
        System.out.println(a+b);
    }
}