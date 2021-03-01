import java.util.*;
class recursive_sumofdigits
{
    int digsum(int n)
    {
        if(n==0)
        return 0;
        else 
        return (n% 10 + digsum(n/10));
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        recursive_sumofdigits ob = new recursive_sumofdigits();
        System.out.println("Enter the number");
        int n = in.nextInt();
        int sum = ob.digsum(n);
        System.out.println(sum);
    }
}