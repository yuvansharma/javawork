import java.util.*;
class recursive_lcm
{
    static int lcm = 1;
    int lcm(int a, int b)
    {
        if(lcm%a==0&&lcm%b==0)
        return lcm;
        lcm++;
        lcm(a,b);
        return lcm;
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        recursive_lcm ob = new recursive_lcm();
        System.out.println("Enter the two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int lcm = ob.lcm(a,b);
        System.out.println("The LCM of the two numbers is: "+lcm);
    }
}