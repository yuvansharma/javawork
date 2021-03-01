//Write a program to check whether a program is a Bouncy Number, Increasing Number or Decreasing Number
import java.util.*;
public class bouncy
{
    
    boolean isIncreasing(int n)
    {
        int last  = n%10; int digit=0; boolean f=true;
        while(n!=0)
        {
            digit = n%10;
            if(last<digit)
            {
                f = false;
                break;
            }
            last = digit;
            n = n/10;
        }
        return(f);
    }
    boolean isDecreasing(int n)
    {
        int last  = n%10; int digit=0; boolean f=true;
        while(n!=0)
        {
            digit = n%10;
            if(last>digit)
            {
                f = false;
                break;
            }
            last = digit;
            n = n/10;
        }
        return(f);
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        if(n<0)
        {
            System.out.println("Not increasing, decreasing or bouncy number");
            System.exit(0);
        }
        bouncy ob = new bouncy();
        if(ob.isIncreasing(n))
        System.out.println("Increasing number");
        if(ob.isDecreasing(n))
        System.out.println("Decreasing number");
        if(ob.isIncreasing(n)!=true&&ob.isDecreasing(n)!=true)
        System.out.println("Bouncy Number");
    }
}