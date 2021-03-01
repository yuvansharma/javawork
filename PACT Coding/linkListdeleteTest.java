import java.io.*;
class linkListdeleteTest
{
    protected static linkedList S;
    public static void main (String args[])
    {
        int num;
        S = new linkedList();
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println(".....Starting List Test for Deletion.....\n");
        for(int a = 0;a<5;++a)
        {
            System.out.print("Enter a number: ");
            try
            {
                num = Integer.parseInt(br.readLine());
                S.Insert(num);
                        S.display();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.print("Enter the number to be deleted: ");
        try
        {
            num  = Integer.parseInt(br.readLine());
            Boolean res = S.Delete(num);
            if(res==true)
            System.out.println(num+ "  deleted successfully");
            else
            System.out.println("No such number found in list.");
                    S.display();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("\n Now the list is: ");
        S.display();
        System.out.println("\n----List Test Over----");
    }
}