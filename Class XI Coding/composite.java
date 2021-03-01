// fill a matrix with composite numbers
import java.util.*;
 class composite
{
    int arr[][];
    int m,n;
    Scanner in = new Scanner (System.in);
    composite(int r,int c)
    {
        m = r;
        n = c;
        arr= new int [m][n]; 

    }

    int iscomposite(int p)
    {
        int f=0;
        for (int i=1;i<=p;i++)
        {
            if(p%i==0)
            {
                f++;
            }
        }
        if (f>2)
        return(1);
        else
        return(0);
    }
    void fill()
    {
        int t=4;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                while((iscomposite(t))!=1)
                t++;
                arr[j][i] = t;
                t++;
            }
        }
        
    }
    void display()
    {
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
                
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number of rows and columns");
        int r = in.nextInt();
        int c = in.nextInt();
        composite ob = new composite(r,c);
        ob.fill();
        ob.display();
    }
}