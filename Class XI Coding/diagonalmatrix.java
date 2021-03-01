//Write a Program to check whether a matrix is a diagonal matrix
import java.util.*;
public class diagonalmatrix
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int a=0,b=0,i,j,sum=0;

        System.out.println("Enter the no of rows and columns");
        a = in.nextInt();
        b = in.nextInt();
        int m[][]= new int[a][b];
        System.out.println("Enter the elements");
        for (i = 0;i<a;i++)
        {
            for (j=0;j<b;j++)
            {
                m[i][j] = in.nextInt();
            }
        }
        for (i = 0;i<a;i++)
        {
            for (j=0;j<b;j++)
                System.out.print(m[i][j]+" ");
            System.out.println();
        }
        int k=0,l=a-1,t=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                if(i==j)
                {
                    if(m[i][j]==0)
                    t++;
                }
            }
        }
        if(t==a&&t==b)
        k=1;
        for( i=0;i<a;i++)
        {
            for (j=(i+1);j<b;j++)
            {
                if(m[i][j]!=0)
                k=1;
            }
        }
        for(j=0;j<b;j++)
        {
            for(i=(j+1);i<a;i++)
            {
               if(m[i][j]!=0)
                k=1;
            }
            
        }
        if(k==0)
        System.out.println("Diagonal matrix");
        else
        System.out.println("Not a diagonal matrix");
    }
}