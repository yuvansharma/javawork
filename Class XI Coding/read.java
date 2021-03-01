import java.io.*;
class read
{
    public static void main (String args[]) throws IOException
    {
        FileInputStream f = new FileInputStream("Test.txt");
        int p =0;
        while ((p=f.read())!=-1)
        {
            System.out.print((char)p);
        }
        f.close();
    }
}