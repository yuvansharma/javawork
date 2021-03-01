import java.util.*;
class quiz
{

    public static void main(String args[])
    {
        char arr[][],k[];
        int s[],n;
        System.out.println("Enter the number of participants");
        Scanner in = new Scanner (System.in);
        n = in.nextInt();
        if (n<4||n>10)
        {
            System.out.println("Input Size is out of range");
            System.exit(0);
        }
        arr = new char[n][5];
        s = new int [n];
        k = new char[5];
        System.out.println("Enter key to questions");
        for (int i = 0 ;i<5;i++)
            k[i]=in.next().charAt(0);
        System.out.println("Enter the answers of the participants");
        int high=0;
        for (int i=0;i<n;i++)
        {
            System.out.println("Participant "+(i+1));
            for (int j=0;j<5;j++)
            {
                arr[i][j]= in.next().charAt(0);
                if (arr[i][j]==k[j])
                {
                    s[i]++;
                }
            }
            if (s[i]>high)
            high = s[i];
        }
        for (int i=0;i<n;i++)
        {
            System.out.println("Participant "+(i+1)+" scored: "+s[i]);
            
        }
        System.out.println("Highest score: ");
        for (int i=0;i<n;i++)
        {
            if (s[i]==high)
            System.out.println("Participant "+(i+1));
        }
    }
}