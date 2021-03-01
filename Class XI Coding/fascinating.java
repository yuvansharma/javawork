//Write a Program to check whether a number is a Fascinating Number
import java.util.*;
public class fascinating
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int n1 = in.nextInt();//192
        int n2 = n1*2;//374
        int n3 = n1*3;//576
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        String s3 = Integer.toString(n3);
        String s = s1+s2+s3;//192374576
        char[] ch = {'0','1','2','3','4','5','6','7','8','9'};
        int x = s.length(); int c=0; boolean bl = true;
        for(int i=1;i<=9;i++)
        {
            char ch1 = ch[i];
            c=0;
            for(int j=0;j<x;j++)
            {
                char ch2 = s.charAt(j);
                if(ch1==ch2)
                c++;
            }
            if(c==0||c>1)
            {
                bl=false;
                break;
            }
        }
        System.out.println(s);
        if(bl==false)
        System.out.println("Not a fascinating number");
        else
        System.out.println("Fascinating number");
    }
}