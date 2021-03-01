import java.util.*;
class recursive_gcd
{
    int gcd(int a, int b)//5,10
    {
        if(a==0)
        return b;
        else
        return gcd(b%a, a);
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        recursive_gcd ob = new recursive_gcd();
        System.out.println("Enter the two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = ob.gcd(a,b);
        System.out.println(gcd);
    }
}