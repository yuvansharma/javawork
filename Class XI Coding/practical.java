import java.util.*;
class practical
{
    int digsum(int x)//function to find sum of digits of a number
    {
        int d=0; int sum = 0;
        while(x>0)
        {
            d = x%10;
            sum = sum + d;
            x = x/10;
        }
        return(sum);
    }
    int digits(int x)//function to find number of digits in a number
    {
        int counter = 0;
         while(x>0)//divide x by 10, and increase value of counter
        {
            x = x/10;
            counter++;
        }
        return(counter);
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        practical ob = new practical();
        System.out.println("Enter the numbers M and N");
        int m = in.nextInt();//store value in m
        int n = in.nextInt();//store value in n
        if(m<100||m>10000||n>=100)//if value of m or n is in invalid range, print error message
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        int p = m;//store value of m in p
        while(true)//run loop until we find a number satisfying the conditions
        {
            int sum = ob.digsum(p);//find sum of digits of p
            if(sum==n)//when number is found whose sum = n, break loop
            break;
            p++;
        } 
        int digits = ob.digits(p);
        System.out.println("The required number: "+p);//print output
        System.out.println("Total number of digits: "+ digits);//print output
    }
}