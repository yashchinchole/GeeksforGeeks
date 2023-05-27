//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) 
    {
        data = d; 
        next = null;
    }
}
	

	
public class LinkedList_Element_From_Last
{
    Node head;  
	Node tail;
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	  
     /* Drier program to test above functions */
    public static void main(String args[])throws IOException
    {
         BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		 int t=Integer.parseInt(in.readLine().trim());
		 
		 while(t>0)
         {
             String s[]=in.readLine().trim().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			LinkedList_Element_From_Last llist = new LinkedList_Element_From_Last();
			//int n=Integer.parseInt(br.readLine());
			s=in.readLine().trim().split(" ");
			int a1=Integer.parseInt(s[0]);
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = Integer.parseInt(s[i]); 
				llist.addToTheLast(new Node(a));
			}
          
		//System.out.println(llist.head.data);
        GfG g = new GfG(); 
		//System.out.println(k);
		System.out.println(g.getNthFromLast(llist.head,k));
		
			t--;
		}
	}
}


	
	
// } Driver Code Ends

class GfG {
    int getNthFromLast(Node head, int n) {
        if (head == null || n <= 0)
            return -1;

        Node ptr1 = head, ptr2 = head;
        for (int i = 0; i < n; i++) {
            if (ptr2 == null)
                return -1;
            ptr2 = ptr2.next;
        }

        while (ptr2 != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1.data;
    }
}