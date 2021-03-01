import java.io.*;
class read_write_random
{
    public static void main (String args[]) throws IOException
    {
        File intFile = new File("Number.dat");
        FileOutputStream f = new FileOutputStream(intFile);
        DataOutputStream f2 = new DataOutputStream(f);
        int i, n;
        for (i=0;i<10;i++)
        {
            f2.writeInt((int)(Math.random()*100));
        }
        f2.close();
        FileInputStream f3 = new FileInputStream(intFile);
        DataInputStream f4 = new DataInputStream(f3);
        for(i=0;i<10;i++)
        {
            n = f4.readInt();
            System.out.println(n);
        }
        f4.close();
    }
}