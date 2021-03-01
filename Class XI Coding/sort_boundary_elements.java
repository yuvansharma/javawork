import java.util.*;
class sort_boundary_elements
{
    Scanner in = new Scanner (System.in);
    int arr[][],b[],m,x=0;
    void input()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter size of matrix");
        m = in.nextInt();
        arr = new int[m][m];        
        System.out.println("Enter the elements of matrix");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        x = m*2 + 2 * (m-2);
        b = new int [x];
    }

    void display()
    {
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void access()
    {
        int k=0;
        for (int i=0;i<m;i++)       
            b[k++]=arr[0][i];        
        for (int i=1;i<m;i++)
            b[k++] = arr[i][m-1];
        for (int i=m-2;i>=0;i--)
            b[k++]= arr[m-1][i];
        for (int i=m-2;i>0;i--)
            b[k++]= arr[i][0];
    }

    void bsort()
    {
        int x=b.length;
        for (int i=0;i<x-1;i++)
        {
            for (int j=0;j<(x-1-i);j++)
            {
                if(b[j]>b[j+1])
                {
                    int temp = b[j];
                    b[j]=b[j+1];
                    b[j+1]= temp;
                }
            }
        }
    }

    void fill()
    {
        int k=0;
        for (int i=0;i<m;i++)
            arr[0][i] = b[k++];
        for (int i=1;i<m;i++)
            arr[i][m-1]=b[k++];
        for (int i=m-2;i>=0;i--)
            arr[m-1][i] = b[k++];
        for (int i = m-2;i>0;i--)
            arr[i][0] = b[k++];
    }

    public static void main (String args[])
    {
        sort_boundary_elements ob = new sort_boundary_elements ();
        ob.input();
        System.out.println("The original matrix is: ");
        ob.display();
        ob.access();
        ob.bsort();
        ob.fill();
        System.out.println("The final matrix is: ");
        ob.display();
    }
}
