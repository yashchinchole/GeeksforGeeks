//{ Driver Code Starts
/* package whatever; // don't place package name! */
import java.util.*;
import java.io.*;
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

class Remove_Duplicate_From_LL
{
    Node head;  
    Node temp;
	public void addToTheLast(Node node) 
	{

	  if (head == null) 
	  {
	    head = node;
	    temp = node;
	  }
	  else{
	      temp.next = node;
	      temp = node;
	  }
	}

      void printList(PrintWriter out)
    {
        Node temp = head;
        while (temp != null)
        {
           out.print(temp.data+" ");
           temp = temp.next;
        }  
        out.println();
    }
	
	/* Drier program to test above functions */
	public static void main(String args[])throws IOException
    {
       
        
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
         PrintWriter out=new PrintWriter(System.out);
		 int t=Integer.parseInt(in.readLine().trim());
		  
		 while(t>0)
         {
			int n = Integer.parseInt(in.readLine().trim());
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL();
			String s[]=in.readLine().trim().split(" ");
			int a1=Integer.parseInt(s[0]);
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = Integer.parseInt(s[i]); 
				llist.addToTheLast(new Node(a));
			}
		//llist.printList();	
        Solution g = new Solution();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList(out);
		
        t--;		
        }
        out.close();
    }
}

// } Driver Code Ends

class Solution {
    public Node removeDuplicates(Node head) {
        HashSet<Integer> ans = new HashSet<>();
        if (head == null)
            return null;
        Node temp = head;
        ans.add(temp.data);
        while (temp.next != null) {
            if (!ans.contains(temp.next.data)) {
                ans.add(temp.next.data);
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
            }
        }
        return head;
    }
}