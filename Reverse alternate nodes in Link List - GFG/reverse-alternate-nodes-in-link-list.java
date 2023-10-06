//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends

class Solution {
    public static Node addNode(Node head, int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            return head;
        }

        node.next = head;
        head = node;
        return head;
    }

    public static void rearrange(Node head) {
        if (head.next == null || head.next.next == null)
            return;

        Node tHead = head;
        boolean alt = true;
        Node altNodes1 = null;
        Node altNodes2 = null;

        tHead = tHead.next;
        while (tHead != null) {
            if (alt) {
                alt = false;
                altNodes2 = addNode(altNodes2, tHead.data);
            } else {
                alt = true;
                altNodes1 = addNode(altNodes1, tHead.data);
            }
            tHead = tHead.next;
        }

        while (altNodes1 != null) {
            altNodes2 = addNode(altNodes2, altNodes1.data);
            altNodes1 = altNodes1.next;
        }

        head.next = altNodes2;
    }
}