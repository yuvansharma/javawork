import java.util.*;
class HalfYearly1
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int n1 = in.nextInt();
        int n2 = n1 * 2;
        int n3 = n1 * 3;
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        String s3 = Integer.toString(n3);
        String s = s1 + s2 + s3;//concatenating the strings
        System.out.println("Concatenated number: "+s);
        char ch[] = {'1', '2', '3', '4', '5', '6', '7', '8','9'};
        int flag = 1;
        for(int i=0;i<=8;i++)
        {
            int counter = 0;
            char c = ch[i];
            for(int j=0;j<s.length();j++)
            {
                char c2 = s.charAt(j);
                if(c==c2)
                counter++;
            }
            if(counter==0||counter>1)//if any digit is not there or present more than once, then return a negative flag
            {
                flag = 0;
                break;
            }
        }
        if(flag==0)
        System.out.println("It is not a fascinating number");
        else
        System.out.println("It is a fascinating number");
    }
}
