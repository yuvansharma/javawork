import java.util.*;
class recursive_BinSearch
{
    int arr[]; int n;
    recursive_BinSearch(int num)
    {
        n = num;
        arr = new int[n];
    }
    
    void fillArray()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++)
        arr[i] = in.nextInt();
    }
    void sort()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    int BinSearch(int l, int u, int v)
    {
        int m = (l+u)/2;
        if(v==arr[m])
        return m;
        else if (l>u)
        return -1;
        else if(v>arr[m])
        return BinSearch(m+1,u,v);
        else 
        
        return BinSearch(l,m-1,v);
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int num = in.nextInt();
        recursive_BinSearch ob = new recursive_BinSearch(num);
        ob.fillArray();
        ob.sort();
        System.out.println("Enter the value to be found");
        int val = in.nextInt();
        int pos = ob.BinSearch(0,num-1,val);
        if(pos==-1)
        System.out.println("Not found");
        else
        System.out.println(val+ " is present at index: "+pos);
        
    }
}