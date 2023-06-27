//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}
// } Driver Code Ends

class Sol {
    public static Node findUnion(Node head1, Node head2) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        Node curr1 = head1;
        Node curr2 = head2;
        while (curr1 != null) {
            ts.add(curr1.data);
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            ts.add(curr2.data);
            curr2 = curr2.next;
        }
        Node newHead = null;
        Node newCurr = null;
        Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
            Node temp = new Node(itr.next());
            if (newHead == null) {
                newHead = temp;
                newCurr = temp;
            } else {
                newCurr.next = temp;
                newCurr = temp;
            }
        }
        return newHead;
    }
}