import java.util.*;
public class sorting_non_boundary
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter no of rows and columns");
        int a = in.nextInt();
        int n[][]= new int[a][a];
        System.out.println("Enter the numbers");
        int i,j,k=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                n[i][j]= in.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
        int m[] = new int[a*a -2*a - 2*(a-2)];
        for (i=0;i<a;i++)
        {
            for (j=0;j<a;j++)
            {
                if(i>0&&j>0&&i<a-1&&j<a-1)
                {
                    m[k++]=n[i][j];                    
                }
            }
        }
        for (i=0;i<(m.length-1);i++)
        {
            for (j=0;j<(m.length-1-i);j++)
            {
                if(m[j]>m[j+1])
                {
                    int temp = m[j];
                    m[j]=m[j+1];
                    m[j+1]= temp;
                }
            }
        }
        k=0;
        for (i=1;i<a-1;i++)
        {
            for(j=1;j<a-1;j++)
            {
                n[i][j]=m[k++];
            }
        }  
        System.out.println("Answer");
         for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}