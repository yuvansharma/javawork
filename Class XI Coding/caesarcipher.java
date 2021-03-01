//Write a program to code a string in Caesar Cipher
import java.util.*;
class caesarcipher
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("WELCOME TO CAESAR CIPHER");
        System.out.println("Enter the string");
        String s = in.nextLine();
        int m = s.length();
        String s2 = "";
        if (m<=3 || m>=100)
        {
            System.out.println("This string is of invalid length so it cannot be ciphered");
            System.exit(0);
        }
        for (int i=0;i<m;i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                if (Character.isUpperCase(ch))
                {
                    if(ch>'M')
                        s2 = s2 + (char)(((int)ch)-13);
                    else
                        s2 = s2 + (char)(((int)ch)+13);
                }
                else
                {
                    if(ch>'m')
                        s2 = s2 + (char)(((int)ch)-13);
                    else
                        s2 = s2 + (char)(((int)ch)+13);
                }
            }
            else
            {
                s2 = s2 + ch;                
            }
        }
        System.out.println("The ciphered string: ");
        System.out.println(s2);
    }
}
 