import java.util.*;
class recursive_happy
{
    static int n;
    recursive_happy(int nn)
    {
        n = nn;
    }

    int sum_digits(int i)
    {
        if(i==0)
        {
            return 0;
        }
        else
        {
            int d = i%10;
            return (d*d + sum_digits(i/10));
        }
    }

    void isHappy()
    {
        int temp = n;
        if(temp<=9)
        temp = temp * temp;
        while(temp>9)
        {
            temp = sum_digits(temp);
        }

        if(temp==1)
        {
            System.out.println(n+" is a Happy Number");
        }
        else
        {
            System.out.println(n+" is not a Happy Number");
        }
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int temp = in.nextInt();
        recursive_happy ob = new recursive_happy(temp);
        ob.isHappy();
    }
}