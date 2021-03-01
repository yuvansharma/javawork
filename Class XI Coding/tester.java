import java.io.*;
class tester
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter char");
        String c = in.readLine();
        System.out.println(c);
        System.out.println("Enter numbers");
        //char w = (char)(in.read());
        //int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        switch(c)
        {
            case "c":
            System.out.println("Working");
        }
     }
}