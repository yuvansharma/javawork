//Write a Program to check if a number is Armstrong number
import java.util.*;
class armstrong_number
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int m = n, r, counter = 0; double sum = 0.0;
        while(n>0)
        {
            n=n/10;
            counter++;
        }
        int p = m;
        while(m>0)
        {
            r = m%10;
            sum = sum + Math.pow(r, counter);
            m=m/10;
        }
        if(p==sum)
        System.out.println("Armstrong number");
        else
        System.out.println("Not an Armstrong number");
    }
}