import java.util.*;
public class matrixmultiply
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        int a,b,c,d;
        System.out.println("Enter the number of rows and columns for both the matrices, for matrix multiplication 2nd and 3rd entries should be equal");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        int m1[][]= new int[a][b];
        int m2[][]=new int [c][d];
        int r[][] = new int[a][d];
        int i=0,j=0,sum=0;
        System.out.println("Enter first matrix");
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                m1[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter second matrix");
        for(i=0;i<c;i++)
        {
            for(j=0;j<d;j++)
            {
                m2[i][j]=in.nextInt();
            }
        }
        for(i=0;i<a;i++)
        {
            for(j=0;j<d;j++)
            {
                for(int k=0;k<b;k++)
                {
                    sum = sum + m1[i][k]*m2[k][j];                    
                }
                r[i][j]=sum;
                sum=0;
            }
        }    
        System.out.println("Result of matrix multiplication");
        for(i=0;i<a;i++)
        {
            for(j=0;j<d;j++)
            {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
    }
}