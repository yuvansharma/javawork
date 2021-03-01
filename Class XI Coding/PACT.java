import java.util.*;
class PACT
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int x[] = {1,2,3};
        int y[] = {3,4};
        int s[] = new int[n+1];
        for (int i=0;i<=n;i++)
        {
            s[i]=i+1;
        }
        System.out.println("Enter array");
        int a[] = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if (a[i]<=n+1)
            s[a[i]-1]=0;
        }
        for (int i=0;i<=n;i++)
        {
            if(s[i]!=0)
            {
                System.out.println(s[i]);
                break;
            }
        }
    }
}