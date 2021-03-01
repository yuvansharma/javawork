import java.util.*;
class chardda
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        if(n<=3||n>=10)
        {
            System.out.println("Wrong length");
            System.exit(0);
        }
        char[][] ch = new char[n][n];
        System.out.println("Enter the three characters");
        char ch1 = in.next().charAt(0);//for corners
        char ch2 = in.next().charAt(0);//for non corner boundary positions
        char ch3 = in.next().charAt(0);
        ch[0][0] = ch1;
        ch[0][n-1] = ch1;
        ch[n-1][0] = ch1;
        ch[n-1][n-1] = ch1;
        for (int i=1;i<n-1;i++)
        ch[0][i] = ch2;
        for(int i=1;i<n-1;i++)
        ch[i][n-1] = ch2;
        for(int i=1;i<n-1;i++)
        ch[n-1][i] = ch2;
        for (int i=1;i<n-1;i++)
        ch[i][0] = ch2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ch[i][j]!=ch1&&ch[i][j]!=ch2)
                ch[i][j] = ch3;
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
}