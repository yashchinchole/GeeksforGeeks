//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.ArrayList;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.getPrimes(n);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends

class Solution {
    public static HashSet<Integer> hs = new HashSet<>();
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        ArrayList<Integer> primesTillN = getAllPrimesTillN(n);
        ArrayList<Integer> ans = new  ArrayList<Integer>();
        for(int i=0; i<primesTillN.size(); i++){
            int curr = primesTillN.get(i);
            if(hs.contains(n-curr)){
                ans.add(curr);
                ans.add(n-curr);
                break;
            }
        }
        if(ans.size() == 0){
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
        
    }   
    
    public static ArrayList<Integer> getAllPrimesTillN(int n){
        // seiev of eratosthenes
        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean[] isPrimes = new boolean[n+1];
        Arrays.fill(isPrimes, true);
        isPrimes[0] = false;
        isPrimes[1] = false;
        
        for(int i = 2; i*i <= n; i++){
            if(isPrimes[i]== true){
                for(int j = i*i; j <= n; j+=i){
                    isPrimes[j] = false;
                }
            }
        }
        
        for(int i =2; i<= n; i++){
            if(isPrimes[i] == true){
                primes.add(i);
                hs.add(i);
            }
        }
        return primes;
    }
    
}