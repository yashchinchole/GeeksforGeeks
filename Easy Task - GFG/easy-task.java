//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
	public static void main (String[] args) throws Exception{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
                
        int t=Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n=Integer.parseInt(in.readLine().trim());
            String s=in.readLine().trim();
            int q=Integer.parseInt(in.readLine().trim());
            query a[]=new query[q];
            for(int i=0;i<q;i++){
                String str=in.readLine().trim();
                String st[]=str.split(" ");
                if(st[0].trim().equals("1")){
                    a[i]=new query("1",st[1],st[2],"");
                }else{
                    a[i]=new query("2",st[1],st[2],st[3]);
                }
            }
            Solution ob=new Solution();
            ArrayList<Character> ans=ob.easyTask(n,s,q,a);
            for(char ch:ans){
                out.print(ch+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static ArrayList<Character> easyTask(int n, String s, int q, query queries[]) {
        char[] arr = s.toCharArray();
        ArrayList<Character> res = new ArrayList<Character>();

        for (int i = 0; i < q; i++) {
            query qu = queries[i];
            if (qu.type.equals("1")) {
                int ind = Integer.parseInt(qu.a);
                arr[ind] = qu.b.charAt(0);
            } else {
                int left = Integer.parseInt(qu.a);
                int right = Integer.parseInt(qu.b);
                int k = Integer.parseInt(qu.c);

                int[] freq = new int[26];
                for (int j = left; j <= right; j++)
                    freq[arr[j] - 'a']++;

                int j = 25;
                while (k > 0) {
                    if (k - freq[j] > 0)
                        k -= freq[j];
                    else {
                        k = 0;
                        break;
                    }
                    j--;
                }

                res.add((char) ('a' + j));
            }
        }

        return res;
    }
}

class query {
    String type;
    String a;
    String b;
    String c;

    public query(String type, String a, String b, String c) {
        this.type = type;
        this.a = a;
        this.b = b;
        this.c = c;
    }
}