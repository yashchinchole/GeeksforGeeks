//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution g = new Solution();
            head = g.sortedInsert(head,k);
            
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends

class Solution {
    Node sortedInsert(Node head, int key) {
        Node newNode = new Node(key);
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data > key) {
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if (prev != null) {
            Node cur = prev.next;
            prev.next = newNode;
            newNode.next = cur;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
}