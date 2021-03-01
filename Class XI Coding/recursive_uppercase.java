import java.util.*;
class recursive_uppercase
{
    static String s2=""; 
    void convert(String s, int i)
    {
        if(i<s.length())
        {       
            char ch = s.charAt(i);
            ch = Character.toLowerCase(ch);
            s2 = s2 + ch;
            convert(s,i+1);
        }  
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the string");
        String s = in.nextLine();
        recursive_uppercase ob = new recursive_uppercase();
        ob.convert(s, 0);
        System.out.println("The converted string: "+s2);
    }
}