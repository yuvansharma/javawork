//Write a Program to find the transpose of a matrix
import java.util.*;
public class transpose
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int m[][]= new int[2][2];
        int n[][]= new int[2][2];
        System.out.println("Enter the numbers");
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                m[i][j]= in.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                n[j][i]=m[i][j];
            }
        }
        System.out.println("Transpose of Matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}