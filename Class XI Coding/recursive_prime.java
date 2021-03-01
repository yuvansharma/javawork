import java.util.*;
class recursive_prime
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
        recursive_prime ob = new recursive_prime();
        System.out.println("Enter the number");
        int a = in.nextInt();
        int flag = ob.prime(a,2);
        if(flag!=1)
            System.out.println("Not a prime number");
        else
            System.out.println("Prime number");
    }
}