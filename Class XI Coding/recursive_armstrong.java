import java.util.*;
class recursive_armstrong
{
    static int n,l;
    recursive_armstrong(int nn)
    {
        n = nn;
    }

    int sum_pow(int i)
    {
        if(i==0)
        {
            return 0;
        }
        else
            return (int)(Math.pow(i%10, l)) + sum_pow(i/10);
    }

    void isArmstrong()
    {
        int temp = n;
        int sum = sum_pow(temp);
        if(sum==n)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int temp = in.nextInt();
        recursive_armstrong ob = new recursive_armstrong(temp);
        int counter = 0;
        while(temp>0)
        {
            temp = temp/10;
            counter++;
        }
        l=counter;
        ob.isArmstrong();
    }
}