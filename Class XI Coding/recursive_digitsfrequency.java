import java.util.*;
class recursive_digitsfrequency
{
    static int a[] = {0,0,0,0,0,0,0,0,0,0};
    void count (int n)
    {
        if(n>0)
        {
            int d = n%10;
            a[d]++;
            count(n/10);
        }
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        recursive_digitsfrequency ob = new recursive_digitsfrequency();
        ob.count(n);
        for(int i=0;i<=9;i++)
        {
            if(a[i]!=0)
            System.out.println("Frequency of "+i+" is: "+a[i]);
        }
    }
}