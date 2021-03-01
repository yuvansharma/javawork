import java.io.*;
class read_write
{
    public static void main (String args[]) throws IOException
    {
        byte[] bytes = {'R','E','C','U','R','S','I','O','N',' ','I','S',' ','G','O','O','D'};
        FileOutputStream f = new FileOutputStream ("Test2.txt");
        f.write(bytes);
        f.close();
        FileInputStream f2 = new FileInputStream ("Test2.txt");
        int p;
        while ((p=f2.read())!=-1)
        {
            System.out.print((char)p);
        }
        f2.close();
    }
}