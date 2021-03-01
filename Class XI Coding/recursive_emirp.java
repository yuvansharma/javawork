import java.util.*;
class recursive_emirp
{
    int n,rev,f;
    recursive_emirp(int nn)
    {
        n = nn;
        rev = 0;
        f = 2;
    }
    int isprime(int x, int n)
    {
        if(x==n)
        return 1;
        else if(n%x==0||n==1)
        return 0;
        else
        return isprime(x+1, n);
    }
    void isEmirp()
    {
        int temp = n;
        while(temp>0)
        {
            int d = temp%10;
            rev = rev*10 + d;
            temp = temp/10;
        }
        int a = isprime(f,n);
        int b = isprime(f,rev);
        if(a==1&&b==1)
        System.out.println("Emirp number");
        else
        System.out.println("Not an Emirp number");
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        recursive_emirp ob = new recursive_emirp(n);
        ob.isEmirp();
        

    }
}