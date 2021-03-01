//Write a program to fill a matrix with three characters entered by the user
import java.util.*;
class matrixfill
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter size of the array");
        int n = in.nextInt();
        if(n<2||n>10)
        {
            System.out.println("Invalid length");
            System.exit(0);
        }
        char ch[][] = new char[n][n];
        System.out.println("Enter the three characters");
        char ch1 = in.next().charAt(0);//element for up and bottom
        char ch2 = in.next().charAt(0);
        char ch3 = in.next().charAt(0);//element for diagonals
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j||(i+j)==(n-1))
                    ch[i][j] = ch3;
                else
                    ch[i][j] = ch2;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n-1-i;j++)
            {
                ch[i][j] = ch1;
                ch[n-1-i][j] = ch1;
            }
        }
        System.out.println("The matrix is: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
}