//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int [] arr = new int[n];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			int [] ans = ob.nearestSmallestTower(arr);
			for(int i = 0; i < n; i++)
				System.out.print(ans[i]+" ");
			System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    int[] nearestSmallestTower(int[] nums) {
        ArrayList<Node> arr = new ArrayList<Node>();
        ArrayList<Node> arr2 = new ArrayList<Node>();
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty()) {
                if (nums[st.peek()] >= nums[i])
                    st.pop();
                else
                    break;
            }
            if (!st.isEmpty()) {
                int val = st.peek();
                arr.add(new Node(nums[val], val));
            } else {
                arr.add(new Node(Integer.MAX_VALUE, Integer.MAX_VALUE));
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            st.pop();
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty()) {
                if (nums[st.peek()] >= nums[i])
                    st.pop();
                else
                    break;
            }
            if (!st.isEmpty()) {
                int val = st.peek();
                arr2.add(new Node(nums[val], val));
            } else {
                arr2.add(new Node(Integer.MAX_VALUE, Integer.MAX_VALUE));
            }
            st.push(i);
        }
        Collections.reverse(arr2);
        for (int i = 0; i < nums.length; i++) {
            if (arr.get(i).height == Integer.MAX_VALUE && arr2.get(i).height == Integer.MAX_VALUE) {
                nums[i] = -1;
                continue;
            }
            if (arr.get(i).height == Integer.MAX_VALUE) {
                nums[i] = arr2.get(i).distance;
                continue;
            }
            if (arr2.get(i).height == Integer.MAX_VALUE) {
                nums[i] = arr.get(i).distance;
                continue;
            }
            if (i - arr.get(i).distance == arr2.get(i).distance - i && arr.get(i).height <= arr2.get(i).height
                    || i - arr.get(i).distance < arr2.get(i).distance - i) {
                nums[i] = arr.get(i).distance;
            } else {
                nums[i] = arr2.get(i).distance;
            }
        }
        return nums;
    }
}

class Node {
    int height, distance;

    public Node(int height, int distance) {
        this.height = height;
        this.distance = distance;
    }
}