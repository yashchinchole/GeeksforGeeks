//{ Driver Code Starts
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
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends

class Solution {
    public String FirstNonRepeating(String A) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for (char ch : A.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            queue.add(ch);

            while (!queue.isEmpty()) {
                if (frequencyMap.get(queue.peek()) == 1) {
                    result.append(queue.peek());
                    break;
                } else {
                    queue.remove();
                }
            }

            if (queue.isEmpty())
                result.append("#");
        }

        return result.toString();
    }
}