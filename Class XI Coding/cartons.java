//Write a program to find the number of cartons required to store boxes
import java.util.*;
class cartons
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number of boxes");
        int n = in.nextInt();
        if (n<1||n>1000)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        int arr[] = {48,24,12,6};
        int n2 = n;
        int total=0, count =0;
        for (int i=0;i<4;i++)
        {
            count  = n/arr[i];
            if (count!=0)
                System.out.println(arr[i]+"\tX\t"+ count + " = "+ arr[i]*count);    
            total = total + count;
            n=n%arr[i];
        }
        if (n>0)
        {
            System.out.println("remaining boxes = " + n+ "X 1 = "+n);
            total++;
        }
        else
            System.out.println("Remaining boxes =0");
        System.out.println("Total boxes=\t"+n2);
        System.out.println("Total cartons=\t"+total);
    }
}