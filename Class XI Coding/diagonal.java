//Write a program to print left and right diagonals of a matrix
import java.util.*;
public class diagonal
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int m[][] = new int[4][4];
        int n[][]= new int [4][4];
        int i,j,k=3;
        System.out.println("Enter the elements of the 4*4 matrix");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                m[i][j]= in.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Elements of the left diagonal:");
        for(i=0;i<4;i++)
        {
            System.out.println(m[i][i]);
        }
        System.out.println("Elements of the right diagonal:");
        for (i=0;i<4;i++)
        {
            System.out.println(m[i][3-i]);
           
        }
        }
    }
