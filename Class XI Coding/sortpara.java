//Write a program to sort a paragraph
import java.util.*;
public class sortpara
{
    void sort(String sent[], int p[])
    {
        int n = sent.length, t1 = 0;
        String t2 = "";
        for (int i=0;i<(n-1);i++)
        {
            for (int j=0;j<(n-1-i);j++)
            {
                if(p[j]>p[j+1])
                {
                    t1 = p[j];
                    p[j] = p[j+1];
                    p[j+1] = t1;
                    t2 = sent[j];
                    sent[j] = sent[j+1];
                    sent[j+1] = t2;
                }
            }
        }
        printResult(sent,p);
    }

    void printResult(String w[], int p[]) 
    {
        int n = w.length;
        for(int i=0; i<n; i++)   
        {           
            System.out.println(w[i]+" = "+p[i]);    
        }     
    }          

    int countwords(String s)
    {
        StringTokenizer st = new StringTokenizer(s, " .,!?");
        int a = st.countTokens();
        return (a);
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        sortpara ob = new sortpara();
        System.out.println("Enter the paragraph");
        String s = in.nextLine();
        StringTokenizer str = new StringTokenizer(s,".!?");
        int count = str.countTokens();
        if (count>10)
        {
            System.out.println("Max of 10 sentences is allowed");
            System.exit(0);
        }
        String sent[] = new String[count];
        int p[] = new int[count];
        for (int i=0;i<count;i++)        
        {
            sent[i] = str.nextToken();
            p[i] = ob.countwords(sent[i]);
        }
        ob.sort(sent,p);
    }
}