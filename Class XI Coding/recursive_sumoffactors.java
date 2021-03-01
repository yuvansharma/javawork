import java.util.*;
class recursive_sumoffactors
{
    int num;
    recursive_sumoffactors(int nn)
    {
        num = nn;
    }
    int sum_of_factors(int i)
    {
        if(i==num)
        return 0;
        else
        {
            if(num%i==0)
            return(i+sum_of_factors(i+1));
            else
            return(sum_of_factors(i+1));
        }
    }
    
    void check()
    {
        int sum = sum_of_factors(1);
        if(sum==num)
        System.out.println("Perfect Number");
        else
        System.out.println("Not a Perfect Number");
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        recursive_sumoffactors ob  = new recursive_sumoffactors(n);
        ob.check();
    }
}