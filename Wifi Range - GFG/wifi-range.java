//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            String S = read.readLine().trim();
            Solution ob = new Solution();
            boolean ans = ob.wifiRange(N, S, X); 
            if(ans)
            System.out.println(1);
            else
            System.out.println(0);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution {
    public static boolean wifiRange(int N, String S, int X) {
        boolean[] canUseWifi = new boolean[N];

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                canUseWifi[i] = true;
                int leftRange = Math.max(0, i - X);
                int rightRange = Math.min(N - 1, i + X);
                for (int j = leftRange; j <= rightRange; j++) {
                    canUseWifi[j] = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (!canUseWifi[i])
                return false;
        }
        return true;
    }
}