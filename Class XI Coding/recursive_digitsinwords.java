import java.util.*;
class recursive_digitsinwords
{
    void extract(int n)
    {  
        if(n!=0)
        {
            extract(n/10);
            words(n%10);
        }
    }
    void words(int n)
    {
        switch (n)
        {
            case 0: System.out.println("Zero"); break;
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            case 5: System.out.println("Five"); break;
            case 6: System.out.println("Six"); break;
            case 7: System.out.println("Seven"); break;
            case 8: System.out.println("Eight"); break;
            case 9: System.out.println("Nine"); break;
        }
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        recursive_digitsinwords ob = new recursive_digitsinwords();
        System.out.println("Enter the number");
        int n = in.nextInt();
        ob.extract(n);
    }
}