import java.util.*;
class Disarium
{
    int num, size;
    Disarium (int nn)
    {
        num = nn;
        size = 0;
    }
    void countDigit()
    {
        int temp = num, counter = 0;
        while(temp>0)
        {
            temp = temp/10;
            counter++;
        }
        size = counter;
    }
    int sumofDigits(int n, int p)
    {
        if(n==0)
        return 0;
        else
        return (int)(Math.pow(n%10, p) + sumofDigits(n/10,p-1));
    }
    void check()
    {
        int temp = num;
        int sum = sumofDigits (temp, size);
        if(sum==num)
        System.out.println("Disarium Number");
        else
        System.out.println("Not a Disarium Number");
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int a = in.nextInt();
        Disarium ob = new Disarium (a);
        ob.countDigit();
        ob.check();
    }
}