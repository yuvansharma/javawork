import java.util.*;
class recursive_array
{
    int max(int arr[], int l, int u)
    {
        int max = 0;
        if(l==u)
        return arr[l];
        else
        {
            max = max(arr, l+1, u);
            if(arr[l]>=max)
            return arr[l];
            else
            return max;
        }
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the length of array");
        recursive_array ob = new recursive_array();
        int n = in.nextInt();
        System.out.println("Enter the numbers");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        int max = ob.max(arr, 0, n-1);
        System.out.println("The maximum number is:");
        System.out.println(max);
    }
}
