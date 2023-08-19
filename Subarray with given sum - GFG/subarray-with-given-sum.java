//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> a = new ArrayList<>();

        int sum = 0;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum >= s) {

                while (start < i && sum > s) {
                    sum -= arr[start++];
                }

                if (sum == s) {
                    a.add(start + 1);
                    a.add(i + 1);
                    break;
                }

            }
        }

        if (a.isEmpty()) {
            a.add(-1);
        }

        return a;
    }
}