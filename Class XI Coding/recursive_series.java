import java.util.*;
class recursive_series
{
    int power(int x, int n)
    {
        if(n==0)
        return 1;
        else
        return x*power(x,n-1);
    }
    int factorial(int n)
    {
        if(n==0)
        return 1;
        else 
        return n*factorial(n-1);
    }
    double calculate(int x, int n)
    {
        double s = 0.0;
        for(int i=0;i<=n;i++)
        {
            double num = power(x,i);
            double den = factorial(i);
            double temp = num/den;
            s  = s + temp;
        }
        return(s);
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the value of x and n");
        int x = in.nextInt();
        int n = in.nextInt();
        recursive_series ob = new recursive_series();
        double s = ob.calculate(x,n);
        System.out.println("The sum of the series is: "+s);
    }
}