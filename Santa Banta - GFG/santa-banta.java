//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
    
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
	    Complete obj = new Complete();
		obj.precompute();    	
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [][] = new int[M][2];
		    for(int i = 0;i<M;i++){
	            line = br.readLine();
		        String[] elements = line.trim().split("\\s+");
		        arr[i][0] = Integer.parseInt(elements[0]);
		        arr[i][1] = Integer.parseInt(elements[1]);    
	        }
            int ans = obj.helpSanta(N, M, arr);
            System.out.println(ans);
    	    
		}
	}
}




// } Driver Code Ends

class Complete {
    static int count;
    static ArrayList<Integer> primes = new ArrayList<>();;

    public static int helpSanta(int n, int m, int g[][]) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<Integer>());

        for (int i = 0; i < m; i++) {
            int u = g[i][0];
            int v = g[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean visited[] = new boolean[n + 1];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == false) {
                count = 0;
                DFS(adj, i, visited);
                max = Math.max(max, count);
            }
        }
        if (max == 1)
            return -1;
        return primes.get(max - 1);
    }

    static void DFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visitedited) {
        visitedited[s] = true;
        count++;

        for (int u : adj.get(s))
            if (visitedited[u] == false)
                DFS(adj, u, visitedited);
    }

    static void precompute() {
        int N = 1000000;
        boolean v[] = new boolean[N + 1];
        Arrays.fill(v, true);
        for (int i = 2; i * i <= N; i++)
            if (v[i])
                for (int j = i * i; j <= N; j += i)
                    v[j] = false;

        for (int i = 2; i <= N; i++)
            if (v[i])
                primes.add(i);
    }
}