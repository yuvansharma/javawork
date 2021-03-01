//Write a Program to check if a number is prime adam number
import java.util.*;
class prime_adam_number
{
    int reverse(int n)
    {
        int sum=0, r=0;
        while(n>0)
        {
            r = n%10;
            sum = sum*10 + r;
            n = n/10;
        }
        return(sum);
    }
    int prime (int n)
    { 
        int k=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                k++;
        }
        if(k==2)
            return(1);
        else
            return(0);
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        prime_adam_number ob = new prime_adam_number();
        System.out.println("Enter the values of m and n");
        int m = in.nextInt();
        int n = in.nextInt();
        if(m>=n)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.println("The Prime Adam numbers between " +m+" and "+n+" are:");
        int counter = 0;
        for(int i=m;i<=n;i++)
        {
            int j = ob.reverse(i);
            int i2 = ob.reverse(i*i);
            int j2 = j*j;
            int flag  = ob.prime(i);
            if(i2==j2&&flag==1)
            {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("the frequency of Prime adam integers is "+counter);
    }
}