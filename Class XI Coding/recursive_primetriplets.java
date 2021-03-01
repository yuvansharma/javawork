import java.util.*;
class recursive_primetriplets
{

    int isprime(int x, int n)
    {
        if(x==n)
            return 1;
        else if(n%x==0||n==1)
            return 0;
        else
            return isprime(x+1, n);
    }
    

    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range");
        int p = in.nextInt();
        int q = in.nextInt();
        recursive_primetriplets ob = new recursive_primetriplets();
        int flag = 0;
        for(int i=p;i<=q-6;i++)
        {
            int a  = ob.isprime(2,i);
            int b = ob.isprime(2,i+2);
            int c = ob.isprime(2,i+6);
            int d = ob.isprime(2,i+4);
            if(a==1&&b==1&&c==1)
            {
                System.out.println("Prime Triplets: "+i+"\t"+(i+2)+"\t"+(i+6));
                flag =1;
            }
            if(a==1&&c==1&&d==1)
            {
                System.out.println("Prime Triplets: "+i+"\t"+(i+4)+"\t"+(i+6));
                flag =1;
            }
        }
        if(flag==0)
        System.out.println("No prime triplets found");
    }
}