//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.leastPrimeFactor(n);
            for(int i = 1; i <=n; i++)
            {
                out.print(ans[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public int[] leastPrimeFactor(int N) {
        int[] leastPrimeFactors = new int[N + 1];

        for (int i = 2; i <= N; i++) {
            if (leastPrimeFactors[i] == 0) {
                leastPrimeFactors[i] = i;
                for (long j = (long) i * i; j <= N; j += i) {
                    if (leastPrimeFactors[(int) j] == 0)
                        leastPrimeFactors[(int) j] = i;
                }
            }
        }

        leastPrimeFactors[1] = 1;
        return leastPrimeFactors;
    }
}