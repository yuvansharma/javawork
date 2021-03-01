import java.util.*;
class recursive_factors
{
    void factors(int x, int n)
    {
        if(x<=n)
        {
            if(n%x==0)
            System.out.println(x);
            factors(x+1, n);
        }
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        recursive_factors ob = new recursive_factors();
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("The factors are: ");
        ob.factors(1,n);
    }
}