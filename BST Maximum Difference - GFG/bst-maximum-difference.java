//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GFG {
    
	public static void main (String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t > 0){
	            int n=Integer.parseInt(br.readLine().trim());
	            String s[] = br.readLine().trim().split(" ");

	            int target=Integer.parseInt(br.readLine().trim());
    	    	Node root = null;
                for(int i=0;i<n;i++){
                    root=insert(root,Integer.parseInt(s[i]));
                }
        	    Solution g = new Solution();
        	    System.out.println(g.maxDifferenceBST(root,target));
                t--;
            
        }
    }

    public static Node insert(Node tree, int val) {
        Node temp = null;
        if (tree == null) return new Node(val);
    
        if (val < tree.data) {
            tree.left = insert(tree.left, val);
        } else if (val > tree.data) {
            tree.right = insert(tree.right, val);
        }
    
        return tree;
    }
  
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
        public static void help(Node root,int target,int a,int b,int ans[],boolean mila){
        if(root==null){
            return;
        }
        if(root.data==target)mila=true;
        if(mila==true){
            b+=root.data;
            help(root.left,target,a,b,ans,mila);
            help(root.right,target,a,b,ans,mila);
            if(root.left==null && root.right==null){
                b-=target;
                ans[0]=Math.max(ans[0],a-b);
            }
        }
        else{
            a+=root.data;
            if(target<root.data)help(root.left,target,a,b,ans,mila);
            else help(root.right,target,a,b,ans,mila);
        }
    }
    public static int maxDifferenceBST(Node root,int target)
    {
        int a=0,b=0;
        int ans[] = new int[1];
        ans[0]=Integer.MIN_VALUE;
        boolean mila=false;
        help(root,target,a,b,ans,mila);
        if(ans[0]==Integer.MIN_VALUE)return -1;
        return ans[0];
        
    }
}