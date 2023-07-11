//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends

class Solution {
    int findK(int a[][], int n, int m, int k) {
        int i = 0, l = n, r = m;
        while (k > (2 * (l + r) - 4)) {
            i++;
            k -= (2 * (l + r) - 4);
            l -= 2;
            r -= 2;
        }
        if (k <= (m - 2 * i))
            return a[i][i + k - 1];
        k -= (m - 2 * i);
        if (k <= (n - 2 * i - 1))
            return a[i + k][m - i - 1];
        k -= (n - 2 * i - 1);
        if (k <= (m - 2 * i - 1))
            return a[n - i - 1][m - i - k - 1];
        k -= (m - 2 * i - 1);
        return a[n - i - k - 1][i];
    }
}