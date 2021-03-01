//Write a program to print names of teams on a banner
import java.io.*;
class teamsbanner
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter the number of teams");
        int n = Integer.parseInt(in.readLine());
        if(n<=2||n>=9)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        String [] x = new String [n]; int l = 0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of Team Number "+(i+1));
            x[i] = in.readLine();
            if(l<x[i].length())
                l = x[i].length();
        }
        for(int i=0;i<l;i++)
        {

            for(int j=0;j<n;j++)
            {
                if(i<x[j].length())
                    System.out.print(x[j].charAt(i)+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}