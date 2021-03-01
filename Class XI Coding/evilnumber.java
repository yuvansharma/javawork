// write a program to check whether a number is EVIL or not
import java.util.*;
class evilnumber
{
    public static void main (String args[])
    { 
        Scanner in = new Scanner (System.in);
        System.out.println("Enter 1 for yes and 0 for no");
        int choice = in.nextInt();
        while(choice==1)
        {
            System.out.println("Enter the number");
            int n = in.nextInt();
            if(n<=2||n>=100)
            {
                System.out.println("Invalid range");
                System.exit(0);
            }
            String store = "";int m = 0;
            while(n>0)
            {
                m= n%2;
                store = m + store;
                n = n/2;
            }
            int l = store.length(), counter = 0;
            for(int i=0;i<l;i++)
            {
                char ch = store.charAt(i);
                if(ch=='1')
                    counter++;
            }
            System.out.println("the binary equivalent is: "+store);
            if(counter%2==0)
                System.out.println("EVIL NUMBER");
            else
                System.out.println("NOT AN EVIL NUMBER");
                System.out.println("enter choice");
                choice = in.nextInt();
                if(choice!=1)
                break;
        }
    }
}