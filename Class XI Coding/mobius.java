//Write a Program to implement the Mobius Function
import java.util.*;
class mobius
{
    int n;
    mobius()
    {
        n=0;
    }

    void input()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        n = in.nextInt();
    }

    int primefac()
    {
        int a=n,f=0,c=0,i=2;//c is for checking how many times a is divisible, f is to count number of factors
        while(a>1)
        {
            c=0;
            while(a%i==0)
            {
                c++;
                f++;
                a=a/i;
            }
            i++;
            if(c>1)
                return(0);
        }
        return(f);
    }

    void display()
    {
        if(n==1)
            System.out.println("Output: 1");
        else
        {
            int x = primefac();
            if(x==0)
                System.out.println("Output: 0");
            else
                System.out.println("Output: "+(int)(Math.pow(-1,x)));
        }
    }

    public static void main(String args[])
    {
       mobius ob = new mobius();
       ob.input();
       ob.display();
    }
}