//Write a Program to rotate a matrix by 90
import java.util.*;
class rotatematrix
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter size of matrix");
        int m = in.nextInt();
        if(m<=2)
        {
            System.out.println("Invalid length");
            System.exit(0);
        }
        int a[][] = new int[m][m];
        System.out.println("Enter the matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int r[][] = new int[m][m]; int row=0; int col = m-1;
        for(int i=0;i<m;i++)
        {
            row=0;
            for(int j=0;j<m;j++)
            {
                r[row++][col] = a[i][j];
            }
            col--;
        }
        System.out.println("Rotated Matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
        int sum = a[0][0] + a[0][m-1] + a[m-1][0] + a[m-1][m-1];
        System.out.println("The sum of corner elements is: "+sum);
    }
}
