import java.util.*;
class recursive_fibo
{
    int fibo(int n)
    {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        else
            return (fibo(n-1)+fibo(n-2));
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        recursive_fibo ob = new recursive_fibo();
        int n = in.nextInt();
        System.out.println("The series:");
        for(int i=1;i<=n;i++)
        {
            System.out.println(ob.fibo(i));
        }
        int term = ob.fibo(n);
        System.out.println("the term at position "+n+" is: ");
        System.out.println(term);
    }
}
