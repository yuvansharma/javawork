import java.util.*;
class HalfYearly2
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the sentence");
        String s = in.nextLine();
        int l = s.length();
        char lastchar = s.charAt(l-1);
        if(lastchar!='.'&&lastchar!='?'&&lastchar!='!')
        {
            System.out.println("Invalid sentence ending");
            System.exit(0);
        }
        StringTokenizer str = new StringTokenizer(s," .?!");
        int counter = str.countTokens();
        String word="",s2 = "";
        System.out.print("Enter the word to be deleted");
        String deletedword = in.next();
        System.out.print("Enter the position of the word in the sentence");
        int pos = in.nextInt();

        if(pos<1 || pos>counter) 
        {
            System.out.println("Invalid word position");
        }
        else
        {      
            for(int i=1; i<=counter; i++)
            {
                word = str.nextToken();

                if(word.equals(deletedword)==true && i == pos)//if it is the word to be deleted AND the correct position
                    continue;
                s2 = s2 + word + " ";
            }
            System.out.print("The trimmed sentence is: "+s2.trim()+lastchar);
        }
    }
}