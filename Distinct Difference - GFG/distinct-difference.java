//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.getDistinctDifference(N, A);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<>();
        int[] right1 = new int[N];
        int[] left1 = new int[N];
        
        left1[0]=0;
        left.add(A[0]);
        for(int i=1; i<N; i++)
        {
            left1[i]= left.size();
            if(!left.contains(A[i]))
            {
                left.add(A[i]);
            }
        }
        
        right1[N-1]=0;
        right.add(A[N-1]);
        
        for(int i= N-2; i>=0; i--)
        {
            right1[i]= right.size();
            if(!right.contains(A[i]))
            {
                right.add(A[i]);
            }
        }
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<N; i++)
        {
            int a = (left1[i]-right1[i]);
            ans.add(a);
        }
        
        return ans;
    }
}