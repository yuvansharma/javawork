import java.util.*;
public class diagtriag
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
        System.out.println("Elements of the upper triangle:");
        for (i=0;i<a;i++)
        {
            for (j=(i+1);j<b;j++)
            {
                System.out.println(m[i][j]);
            }
        }
        System.out.println("Elements of the lower triangle:");
        for(j=0;j<b;j++)
        {
            for(i=(j+1);i<a;i++)
            {
                System.out.println(m[i][j]);
            }
            
        }
    }
}