import java.util.*;
class fill_rowwise
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the value of N");
        int n = in.nextInt();
        if(n<=2||n>=10)
        {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        System.out.println("Enter the elements of the single dimensional array");
        int a[] = new int[n];
        int b[][] = new int [n][n];
        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }

        }
        System.out.println("The sorted SDA array: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                b[i][j] = a[j];
            }
            int r = 0;
            for(int w = n-i;w<n;w++)
            {
                b[i][w] = a[r++];
            }
        }
        System.out.println("The DDA:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}