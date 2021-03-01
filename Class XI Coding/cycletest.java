import java.util.*;
class cycletest
{
    public static void main (String args[])
    {
        int a[][] = new int[4][4];
        int k=1, c1=0, c2=3, r1=0, r2=3;//c1 starts from top, r1 starts from left, c2 starts from bottom, r2 starts from right of DDA
        while(k<=16)
        {
            for(int i=c1;i<=c2;i++)//for filling horizontal rows from left to right
            {
                a[r1][i]=k++;
            }

            for(int j=r1+1;j<=r2;j++)//for filling vertical columns from top to bottom
            {
                a[j][c2]=k++;
            }

            for(int i=c2-1;i>=c1;i--)//for filling horizontal rows from right to left
            {
                a[r2][i]=k++;
            }

            for(int j=r2-1;j>=r1+1;j--)//for filling vertical columns from bottom to top
            {
                a[j][c1]=k++;
            }
            //to ensure previous positions are not overwritten, we decrease c2 and r2 and increase c1 and r1
            c1++;
            c2--;
            r1++;
            r2--;
        }
        System.out.println("Spiral Matrix: ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+"\t");//so that single and double digits have equal spacing
            }
            System.out.println();
        }
    }
}