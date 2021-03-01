import java.util.*;
class recursive_krishnamurthy
{
    int factorial(int n)
    {
        if(n==0)
            return 1;
        else 
            return n*factorial(n-1);
    }

    void check(int n)
    {
        int s = 0;
        int temp = n;
        while(temp>0)
        {
           int d = temp%10;
           s = s + factorial(d);
           temp = temp/10;
        }
        if(n==s)
        System.out.println("Krishnamurthy number");
        else
        System.out.println("Not a Krishnamurthy number");
    }

    public static void main (String args[])
    {
        System.out.println("Enter the number");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        recursive_krishnamurthy ob = new recursive_krishnamurthy();
        ob.check(n);

    }

}