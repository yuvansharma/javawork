import java.util.*;
class recursive_primesinrange
{
    int isPrime(int x, int n)
    {
        if(x==n)
            return 1;
        else if(n%x==0||n==1)
            return 0;
        else
            return isPrime(x+1, n);
    }
    void printPrimes(int p, int q)
    {
        if(p<=q)
        {
            if(isPrime(2,p)==1)
            System.out.println(p);
        }
        if(p+1<=q)
        printPrimes(p+1,q);
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        recursive_primesinrange ob = new recursive_primesinrange();
        System.out.println("Enter the range");
        int p = in.nextInt();
        int q = in.nextInt();
        ob.printPrimes(p,q);
    }
}