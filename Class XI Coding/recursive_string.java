import java.util.*;
class recursive_string
{
    static String s, s1="";
    void reverse(int i)
    {
        if(i<s.length())
        {
            reverse(i+1);//hello
            s1 = s1 + s.charAt(i);
        }
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the string");
        recursive_string ob = new recursive_string();
         s= in.nextLine();
         ob.reverse(0);
        System.out.println("The reversed string is:");
        System.out.println(s1);
    }
}
