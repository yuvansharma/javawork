import java.io.*;
class linkListTest
{
    protected static linkedList S;
    public static void main (String args[])
    {
        int num;
        S = new linkedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("....Starting List Test for INSERTION....\n");
        for(int a = 0; a< 5; ++a)
        {
            System.out.print("Enter a number: ");
            try
            {
                num = Integer.parseInt(br.readLine());
                S.Insert(num);
                System.out.println("Inserted: "+num);
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }            
        }
        System.out.println("\n Created List is: ");
        S.display();
        System.out.println("\n----List Test Over----");
    }
}

