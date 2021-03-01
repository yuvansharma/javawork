import java.io.*;
class copy_write
{
    public static void main (String args[]) throws IOException
    {
        FileInputStream f = new FileInputStream ("Test2.txt");
        FileOutputStream f2 = new FileOutputStream ("Test4.txt");
        int b;
        do
        {
            b = f.read();
            f2.write((char)b);
        }
        while(b!=-1);
        f.close();
        f2.close();
        FileInputStream f3 = new FileInputStream ("Test4.txt");
        int a;
        while((a=f3.read())!=-1)
        {
            System.out.print((char)a);
        }
    }
}