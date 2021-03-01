import java.util.*;
class recursive_disarium
{
    int num,  size;
    recursive_disarium(int nn)
    {
         num = nn;
         size = 0;
    }
    void countDigit ()
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
        int store = sumofDigits(temp, size);
        if(store==num)
        System.out.println("disarium number");
        else
        System.out.println("not a disarium number");
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int nn = in.nextInt();
        recursive_disarium ob = new recursive_disarium(nn);
        ob.countDigit();
        ob.check();
    }
}