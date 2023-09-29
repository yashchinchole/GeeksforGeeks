# Number Of Enclaves
## Medium
<div class="problems_problem_content__Xm_eO" speechify-initial-font-family="Roboto, sans-serif" speechify-initial-font-size="16px"><p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">You are given an <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">n&nbsp;x m</strong>&nbsp;binary matrix <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">grid</strong>, where <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">0</strong> represents a sea cell and <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1</strong> represents a land cell.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Find the number of land cells in <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">grid</strong> for which we cannot walk off the boundary of the grid in any number of moves.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 1:</span></strong></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input:</strong></span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">grid[][] = {{0, 0, 0, 0},
            {1, 0, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}}</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong></span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">3</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Explanation:</strong></span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">0 0 0 0
1 0 <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1</strong> 0
0 <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1</strong> <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1</strong> 0
0 0 0 0</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">The highlighted cells represents the land cells.</span>
</pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 2:</span></strong></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input:</strong></span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">grid[][] = {{0, 0, 0, 1},
            {0, 1, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 1},
            {0, 1, 1, 0}}</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong></span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">4</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Explanation:</strong></span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">0 0 0 1
0 <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1</strong> <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1</strong> 0
0 <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1</strong> <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1</strong> 0
0 0 0 1
0 1 1 0</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">The highlighted cells represents the land cells.</span></pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Your Task:</span></strong></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">You don't need to print or input anything. Complete the function <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">numberOfEnclaves()&nbsp;</strong>which takes a 2D integer matrix <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">grid&nbsp;</strong>as the input parameter and returns an integer, denoting the number of land cells.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Time Complexity:</strong> O(n * m)</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Space Complexity:</strong> O(n * m)</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Constraints:</span></strong></p>
<ul speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">
<li speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1 &lt;= n, m &lt;= 500</span></li>
<li speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">grid[i][j] == 0 or 1</span></li>
</ul></div>