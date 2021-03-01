import java.util.*;
public class encryptalphabet
{
    int potential (String s)
    {
        int l = s.length(); int p=0;
        for (int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            for (int j=1;j<=26;j++)
            {
                char ch2 = (char)(j+64);
                if(ch==ch2)
                p = p + j;
            }
        }
        return(p);
    }
    void sort(String word[], int p[])
    {
        int a = word.length;
        for (int i=0;i<a-1;i++)
        {
            for (int j=0;j<a-1-i;j++)
            {
                if(p[j]>p[j+1])
                {
                    int b = p[j];
                    p[j] = p[j+1];
                    p[j+1] = b;
                    String st = word[j];
                    word[j] = word[j+1];
                    word[j+1] = st;
                }
            }
        }
        System.out.println("The sorted sentence is: ");
        for(int i=0;i<a;i++)
        {
            System.out.print(word[i]+" ");
        }
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        encryptalphabet ob = new encryptalphabet ();
        System.out.println("Enter the sentence");
        String s = in.nextLine();
        int x = s.length();
        char abc = s.charAt(x-1);
        System.out.println(abc);
        if (abc!='.'&&abc!='?'&&abc!='!')
        {
            System.out.println("Illegal sentence");
            System.exit(0);
        }
        s = s.toUpperCase();
        StringTokenizer st = new StringTokenizer (s," .,!?");
        int count = st.countTokens();
        String word[] = new String[count];
        int p[] = new int[count];
        for (int i=0;i<count;i++)
        {
            word[i] = st.nextToken();
            p[i] = ob.potential(word[i]);
            System.out.println(word[i]+" = "+p[i]);
        }
        ob.sort(word,p);
    }
}