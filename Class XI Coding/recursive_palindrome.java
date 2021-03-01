import java.util.*;
class recursive_palindrome
{
    int num, revnum;
    recursive_palindrome()
    {
        num = 0;
        revnum = 0;
    }
    void accept()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        num = in.nextInt();
    }
    int reverse(int y)
    {
        if(y==0)
        return revnum;
        else 
        {
            revnum = revnum * 10 + y%10;
            return(reverse(y/10));
        }
        
    }
    void check()
    {
        int temp = num;
        int check = reverse(temp);
        if(check==num)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not a Palindrome Number");
    }
    public static void main (String args[])
    {
        recursive_palindrome ob = new recursive_palindrome();
        ob.accept();
        ob.check();
    }
}