import java.util.*;
class recursive_twinprimes
{
    int prime(int n, int i)
    {
        if(i==n)
        return 1;
        else if(n%i==0||n==1)
        return 0;
        else 
        return prime(n,i+1);
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        recursive_twinprimes ob = new recursive_twinprimes();
        System.out.println("Enter the numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int flag1 = ob.prime(a,2);
        int flag2 = ob.prime(b,2);
        if(flag1==1&&flag2==1&&Math.abs(a-b)==2)
            System.out.println("Twin Primes");
        else
            System.out.println("Not Twin Prime numbers");
    }
}