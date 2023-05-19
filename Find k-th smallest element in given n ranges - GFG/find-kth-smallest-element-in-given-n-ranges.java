//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        
        while(t-- > 0){
            int n=Integer.parseInt(in.readLine().trim());
            int range[][]=new int[n][2];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                range[i][0]=Integer.parseInt(s[0]);
                range[i][1]=Integer.parseInt(s[1]);
            }
            int q=Integer.parseInt(in.readLine().trim());
            int Q[]=new int[q];
            String s[]=in.readLine().trim().split(" ");
            for(int i=0;i<q;i++){
                Q[i]=Integer.parseInt(s[i]);
            }

            Solution ob=new Solution();
            ArrayList<Integer> ans=ob.kthSmallestNum(n, range, q, Q);

            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    } 
}
// } Driver Code Ends

class Solution {
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        Arrays.sort(range, (int[] a, int[] b) -> {
            return a[0] - b[0];
        });

        ArrayList<int[]> al = merge(range, n);
        n = al.size();
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = new int[n];
        int sum = al.get(0)[1] - al.get(0)[0] + 1;
        arr[0] = sum;
        for (int i = 1; i < n; i++) {
            sum += (al.get(i)[1] - al.get(i)[0] + 1);
            arr[i] = sum;
        }

        for (int i = 0; i < q; i++) {
            if (queries[i] > arr[n - 1])
                ans.add(-1);
            else {
                int ind = binarySearch(arr, queries[i]);
                if (ind != 0)
                    ans.add(queries[i] - arr[ind - 1] - 1 + al.get(ind)[0]);
                else
                    ans.add(al.get(0)[0] + queries[i] - 1);
            }
        }
        return ans;
    }

    static int binarySearch(int range[], int el) {
        int lo = 0, hi = range.length, mid;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (range[mid] >= el) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    static ArrayList<int[]> merge(int range[][], int n) {
        ArrayList<int[]> al = new ArrayList<>();
        int x[] = new int[2];
        x[0] = range[0][0];
        x[1] = range[0][1];
        for (int i = 1; i < n; i++) {
            if (range[i][0] <= x[1]) {
                x[0] = Math.min(x[0], range[i][0]);
                x[1] = Math.max(x[1], range[i][1]);
            } else {
                al.add(new int[] { x[0], x[1] });
                x[0] = range[i][0];
                x[1] = range[i][1];
            }
        }
        al.add(new int[] { x[0], x[1] });
        return al;
    }
}
