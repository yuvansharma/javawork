import java.util.*;
class recursive_factorial
{
    int fact(int n)
    {
        if(n==0)
            return(1);
        else
        {
            System.out.println(n+" X "+(n-1)+"!");
            return(n*fact(n-1));

        }
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        recursive_factorial ob = new recursive_factorial();
        System.out.println("Enter the number");
        int n = in.nextInt();
        int fact = ob.fact(n);
        System.out.println("The factorial: "+fact);
    }
}