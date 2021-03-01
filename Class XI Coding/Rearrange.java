import java.util.*;
class Rearrange
{
    String wrd, newwrd;
    Scanner in = new Scanner (System.in);
    void readword()
    {
        System.out.println(" Enter the word in UPPER CASE");
        wrd = in.next();        
    }
    void freq_vow_con()
    {
        int c1 = 0, c2 = 0; //c1 for vowels, c2 for consonants
        int x = wrd.length();
        for(int i=0;i<x;i++)
        {
            char ch = wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            c1++;
            else
            c2++;
        }
        System.out.println("Number of vowels: "+c1);
        System.out.println("Number of consonants: "+c2);
    }
    void arrange()
    {
        int x = wrd.length();
        String st1 = "", st2 = "";
        for(int i=0;i<x;i++)
        {
            char ch = wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            st1 = st1 + ch;
            else
            st2 = st2 + ch;
        }
        newwrd = st1 + st2;
    }
    void display()
    {
        System.out.println("Original word: "+wrd);
        System.out.println("Rearranged word: "+newwrd);
    }
    public static void main (String args[])
    {
        Rearrange ob = new Rearrange();
        ob.readword();
        ob.freq_vow_con();
        ob.arrange();
        ob.display();
    }
}