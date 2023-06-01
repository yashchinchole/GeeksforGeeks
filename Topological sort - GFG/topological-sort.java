//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(u).add(v);
            }

            int[] res = new Solution().topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


class Solution {
    static int[] topoSort(int N, ArrayList<ArrayList<Integer>> list) {
        boolean visited[] = new boolean[N];
        Arrays.fill(visited, false);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < N; i++) {
            if (!visited[i])
                topologicalSort(list, i, visited, st);
        }
        int A[] = new int[st.size()];
        int i = -1;
        while (!st.isEmpty()) {
            A[++i] = st.peek();
            st.pop();
        }
        return A;
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> list, int it,
            boolean visited[], Stack<Integer> s) {
        visited[it] = true;
        for (int i = 0; i < list.get(it).size(); i++) {
            if (!visited[list.get(it).get(i)])
                topologicalSort(list, list.get(it).get(i), visited, s);
        }
        s.push(it);
    }
}