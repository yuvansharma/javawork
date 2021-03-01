import java.util.*;
class recursive_initials
{
    static String s2=""; 
    void convert(String s, int i)
    {
        if(i<s.length())
        {       
            char ch = s.charAt(i);
            if(ch==' ')
            System.out.print( s.charAt(i+1) + ".");
            convert(s,i+1);
        }  
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the name");
        String s = in.nextLine();
        s = " " + s;
        recursive_initials ob = new recursive_initials();
        ob.convert(s, 0);
        //System.out.println("The initials of the name: "+s2);
    }
}