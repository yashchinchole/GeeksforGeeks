public class Solution {
    public boolean dfs(int[][] grid, boolean[][] vis, int i, int j, int[] cnt) {
        int r = grid.length, c = grid[0].length;
        if (i < 0 || i >= r || j < 0 || j >= c) {
            return false;
        }
        if (grid[i][j] == 0 || vis[i][j]) {
            return true;
        }
        vis[i][j] = true;
        cnt[0]++;
        boolean up = dfs(grid, vis, i-1, j, cnt);
        boolean down = dfs(grid, vis, i+1, j, cnt);
        boolean left = dfs(grid, vis, i, j-1, cnt);
        boolean right = dfs(grid, vis, i, j+1, cnt);
        return up && down && left && right;
    }
    
    public int numEnclaves(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        boolean[][] vis = new boolean[r][c];
        
        int ans = 0;
        for (int i = 1; i < r-1; i++) {
            for (int j = 1; j < c-1; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    int[] cnt = {0};
                    if (dfs(grid, vis, i, j, cnt)) {
                        ans += cnt[0];
                    }
                }
            }
        }
        
        return ans;
    }
}