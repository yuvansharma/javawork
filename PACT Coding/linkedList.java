import java.io.*;
class linkedList
{
    protected Node start;
    public linkedList()
    {
        start = null;
    }

    public boolean isEmpty()
    {
        return start==null;
    }

    public void Insert(int val)
    {
        Node nptr, ptr, save = null;
        nptr = new Node (val,null);
        boolean ins = false;
        if(start==null)
            start = nptr;
        else if (val<=start.getData())
        {
            nptr.setlink(start);
            start = nptr;
        }
        else
        {
            save  = start;
            ptr = start.getlink();
            while(ptr!=null)
            {
                if(val>=save.getData()&&val<=ptr.getData())
                {
                    save.setlink(nptr);
                    nptr.setlink(ptr);
                    ins=true;
                    break;
                }
                else 
                {
                    save = ptr;
                    ptr = ptr.getlink();
                }
            }
            if(ins==false)
            {
                save.setlink(nptr);
            }
        }
    }
    public Boolean Delete(int val)
    {
        Boolean res = false;
        if(start.getData()==val)
        {
            start  = start.getlink();
            res = true;
        }
        else
        {
            Node ptr,save;
            save = start;
            ptr = start.getlink();
            while(ptr!=null)
            {
                if(ptr.getData()==val)
                {
                    Node next = ptr.getlink();
                    save.setlink(next);
                    res = true;
                    break;
                }
                else
                {
                    save = ptr;
                    ptr = ptr.getlink();
                }
            }
        }
        return res;
    }
    public void display()
    {
        Node ptr = start;
        System.out.print(start.getData()+" -->");
        ptr = start.getlink();
        while(ptr.getlink()!=null)
        {
            System.out.print(ptr.getData()+" -->");
            ptr = ptr.getlink();
        }
        System.out.print(ptr.getData()+" !!!!");
        System.out.println();
    }
}