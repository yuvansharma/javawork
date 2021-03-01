import java.util.*;
public class prime
{
    int arr[][];
    int m,n;
    prime(int r, int c)
    {
        m = r;
        n=c;
        arr = new int[m][n];
    }

    int isprime(int p)
    {
        int f=0;
        for(int i=1;i<=p;i++)
        {
            if(p%i==0)
                f++;
        }
        if (f==2)
            return(1);
        else
            return(0);
    }

    void fill()
    {
        int t=2;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                while(isprime(t)!=1)
                    t++;
                arr[i][j] = t;
                t++;
            }
        }
    }

    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int r,c;
        System.out.println("Enter the number of rows and columns");
        r = in.nextInt();
        c = in.nextInt();
        prime ob = new prime(r,c);
        ob.fill();
        ob.display();
    }
}
