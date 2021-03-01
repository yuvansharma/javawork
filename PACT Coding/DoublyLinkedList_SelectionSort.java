import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.text.*;
public class DoublyLinkedList_SelectionSort
{  

    //Represent a node of the doubly linked list  

    class Node
    {  
        int data;  
        Node previous;  
        Node next;  

        public Node(int data)
        {  
            this.data = data;  
        }  
    }  

    //Represent the head and tail of the doubly linked list  
    Node head, tail = null;  

    //addNode() will add a node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  

        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  

    //display() will print out the nodes of the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  

            System.out.print(current.data + " <--> ");  
            current = current.next;  
            if(current==null)
                System.out.println("NULL");
        }  
    }  

    void deleteNode(Node del)
    {

        // Base case
        if (head == null || del == null) {
            return;
        }

        // If node to be deleted is head node
        if (head == del) {
            head = del.next;
        }

        // Change next only if node to be deleted
        // is NOT the last node
        if (del.next != null) {
            del.next.previous = del.previous;
        }

        // Change prev only if node to be deleted
        // is NOT the first node
        if (del.previous != null) {
            del.previous.next = del.next;
        }

        // Finally, free the memory occupied by del
        return;
    }

    public void selectionsort()
    {  
        Node current = null, index = null;  
        int temp;  
        //Check whether list is empty  
        if(head == null) 
        {  
            return;  
        }  
        else 
        {  
            //Current will point to head  
            for(current = head; current.next != null; current = current.next) 
            {  
                //Index will point to node next to current  
                for(index = current.next; index != null; index = index.next) 
                {  
                    //If current's data is greater than index's data, swap the data of current and index  
                    if(current.data > index.data) 
                    {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;
                    }  
                    //System.out.print("  "); 
                    //display();
                }  
                //System.out.print("  "); 
            }
        }
    }

    Node search (int temp)
    {
        Node current = head; int flag = 0;
        while(current!=null)
        {
            int a = current.data;
            if(a==temp)
            {
                break;
            }
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) { 
        long start = System.currentTimeMillis();
        Scanner in = new Scanner (System.in);
        DoublyLinkedList_SelectionSort dList = new DoublyLinkedList_SelectionSort();  
        //Add nodes to the list  
        //System.out.println("Enter the number of nodes");
        int n = 10000;//in.nextInt();
        for(int i=1;i<=n;i++)
        {
            //System.out.println("Enter the value of node "+i);
            int temp = ThreadLocalRandom.current().nextInt(0,10000);
            dList.addNode(temp);
            //dList.display(); 
            //System.out.println();
        }
        /*System.out.println("Enter node to be deleted");
        int temp = in.nextInt();
        Node x = dList.search(temp);

        dList.deleteNode(x);
        System.out.println("The list after deleting first node");
        //Displays the nodes present in the list  
        dList.display();*/
        System.out.println();
        dList.selectionsort();
        System.out.println("List after sorting");
        dList.display();
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }  
}  