import java.util.*;
class recursive_power
{
    int power(int n, int p)
    {
        if(p==0)
            return(1);
        else
        {
            return(n*power(n,p-1));

        }
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        recursive_power ob = new recursive_power();
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("Enter the power");
        int p = in.nextInt();
        int ans = ob.power(n,p);
        System.out.println("The answer: "+ans);
    }
}