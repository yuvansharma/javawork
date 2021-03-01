import java.util.*;
class ConsChange
{
    String word="", st1="", st2="", word2="", word3="",st3="";
    int len;
    Scanner in = new Scanner (System.in);
    void readword()
    {
        System.out.println("Enter the word in lowercase");
        word = in.next();
        len = word.length();
    }

    void shiftcons()
    {

        for(int i=0;i<len;i++)
        {
            char ch = word.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                st1  = st1 + ch;
            }
            else
                st2 = st2 + ch;
        }
        word2 = st2+st1;
    }

    void changeword()
    {
        int x = st2.length();
        for(int i=0;i<x;i++)
        {
            char ch = st2.charAt(i);
            ch = Character.toUpperCase(ch);
            st3 = st3 + ch;
        }
        word3 = st3 + st1;
    }

    void show()
    {
        System.out.println("The original word:  "+word);
        System.out.println("The shifted word:  "+word2);
        System.out.println("The changed word:  "+word3);
    }

    public static void main (String args[])
    {
        ConsChange ob = new ConsChange ();
        ob.readword();
        ob.shiftcons();
        ob.changeword();
        ob.show();

    }
}

