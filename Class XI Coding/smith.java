//Write a Program to check whether a program is a Smith number
import java.util.*;
public class smith{
    int digsum(int n){
        int s=0;
        while(n>0)
        {
            s =s + n%10;
            n=n/10;
        }
        return(s);
    }
    int primesum(int n)
    {
        System.out.println("The prime factors are: ");
        int i=2,p=0;
        while(n>1)
        {
            if(n%i==0)
            {
                System.out.println(i);
                p = p + digsum(i);
                n=n/i;
            }
            else
            {
                i++;
            }
        }
        return(p);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        smith ob = new smith();
        int s = ob.digsum(n);
        int p = ob.primesum(n);
        System.out.println("The sum of digits: "+s);
        System.out.println("The sum of digits of prime factors: "+p);
        if(p==s)
        System.out.println("Smith number");
        else
        System.out.println("Not a smith number");
    }
}