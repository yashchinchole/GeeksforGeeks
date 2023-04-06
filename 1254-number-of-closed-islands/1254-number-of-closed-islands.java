class Solution {
    public boolean dfs(int[][] grid, boolean[][] vis, int i, int j) {
        int r = grid.length, c = grid[0].length;
        // System.out.print(i + ":" + j + " ");
        if (i < 0 || i >= r || j < 0 || j >= c) {
            return false;
        }
        if (grid[i][j] == 1 || vis[i][j]) {
            return true;
        }
        vis[i][j] = true;
        boolean up = dfs(grid, vis, i - 1, j);
        boolean down = dfs(grid, vis, i + 1, j);
        boolean left = dfs(grid, vis, i, j - 1);
        boolean right = dfs(grid, vis, i, j + 1);
        return up && down && left && right;
    }

    public int closedIsland(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        boolean[][] vis = new boolean[r][c];
        int ans = 0;
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                if (grid[i][j] == 0 && !vis[i][j]) {
                    ans += dfs(grid, vis, i, j) ? 1 : 0;
                }
            }
        }
        return ans;
    }
}
