//Write a Program to check whether a number is a circular prime
import java.util.*;
class circularprime
{
    boolean isPrime(int n)
    {
        int c=0;
        for (int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if (c==2)
            return(true);
        else
            return(false);

    }

    int circulate(int n)
    {
        String s = Integer.toString(n);
        String s2 = s.substring(1) + s.charAt(0);
        int a = Integer.parseInt(s2);
        return(a);
    }

    void iscircularprime(int n)
    {
        int a = n; int f=0;
        do
        {
            System.out.println(a);
            if(isPrime(a)==false)
            {
                
                f=1;
                break;
            }
            a = circulate(a);
        }
        while(a!=n);
        if (f==1)
            System.out.println("Not a circular prime");
        else
            System.out.println("Circular prime");
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the no.");
        int a = in.nextInt();
        circularprime ob = new circularprime ();
        ob.iscircularprime(a);
    }
}