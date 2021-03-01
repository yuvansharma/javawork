import java.util.*;
class recursive_magic
{
    static int n;
    int digsum(int x)
    {
        if(x==0)
            return 0;
        else
            return (x%10 + digsum(x/10));
    }

    void isMagic()
    {
        while(n>9)
        {
            n = digsum(n);
        }
        if(n==1)
        System.out.println("Magic number");
        else
        System.out.println("Not a magic number");
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        recursive_magic ob = new recursive_magic();
        System.out.println("Enter a number");
        n = in.nextInt();
        ob.isMagic();
    }

}