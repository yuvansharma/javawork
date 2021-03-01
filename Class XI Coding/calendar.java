//Write a program to print a calendar of the month
import java.util.*;
public class calendar
{

    int numberofdays(String m, int y)
    {
        int d[] = {31,28,31,30,31,30,31,31,30,31,30,31}; int x=0;
        if(y%400==0||y%100!=0&&y%4==0)
            d[1] = 29;
        String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0;i<12;i++)
        {
            if(m.equalsIgnoreCase(month[i]))
                x=d[i];
        }
        return(x);
    }

    int finddaynumber(String f)
    {
        String s[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"}; int x=0;
        for(int i=0;i<7;i++)
        {
            if(f.equalsIgnoreCase(s[i]))
                x=i;
        }
        return(x);
    }

    void calfill(int max,int dayno, String month,int y)
    {
        int cal[][] =new int[6][7]; int n1; int x=1;
        int z=dayno;       
        for(int i=0;i<6;i++)
        {
            for(int j=dayno;j<7;j++)
            {
                if(x<=max)
                {
                    cal[i][j] = x;
                    x++;
                }
            }
            dayno=0;
        }
        for(int j=0;j<z;j++)
        {
            cal[0][j] = cal[5][j];
        }
        printCalendar(cal, y, month);
    }

    void printCalendar(int cal[][], int y, String month)
    {
        
        System.out.println("\t\t\t     "+month+" "+y);
        System.out.println("\t----------------------------------------------------");
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
	System.out.println("\t----------------------------------------------------");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(cal[i][j]!=0)
                    System.out.print("\t"+cal[i][j]);
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("\t----------------------------------------------------");
    }

    public static void main (String args[])
    {
        int max=0;
        Scanner in = new Scanner (System.in);
        calendar ob = new calendar();
        System.out.println("Enter the year");
        int y = in.nextInt();
        System.out.println("Enter the month");
        String month = in.next();
        System.out.println("Enter the first day of the month");
        String f = in.next();
        max = ob.numberofdays(month,y);
        int dayno = ob.finddaynumber(f);
        ob.calfill(max,dayno,month,y);
    }
}