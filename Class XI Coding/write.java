import java.io.*;
class write
{
    public static void main (String args[]) throws IOException
    {
        byte[] bytes = {'N','E','W',' ','D','E','L','H','I',' ','I','N','D','I','A', ' ', 'N','O','I','D','A',' ','Y','E','S'};
        FileOutputStream f = new FileOutputStream ("Test.txt");
        f.write(bytes);
        f.close();
    }
}