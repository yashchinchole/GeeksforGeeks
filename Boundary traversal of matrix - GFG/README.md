# Boundary traversal of matrix
## Easy
<div class="problems_problem_content__Xm_eO" speechify-initial-font-family="Roboto, sans-serif" speechify-initial-font-size="16px"><p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">You are given a matrix&nbsp;of dimensions <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">n&nbsp;x m</strong>. The task is to perform&nbsp;boundary traversal on the matrix in a&nbsp;clockwise manner. </span><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 1:</strong></span></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input</strong>:
n = 4, m = 4
matrix[][] = {{1, 2, 3, 4},
&nbsp;        {5, 6, 7, 8},
&nbsp;        {9, 10, 11, 12},
&nbsp;        {13, 14, 15,16}}
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output</strong>: 1 2 3 4 8 12 16 15 14 13 9 5
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Explanation</strong>:
The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is:
1 2 3 4 8 12 16 15 14 13 9 5
</span></pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 2:</strong></span></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input</strong>:
n = 3, m = 4
matrrix[][] = {{12, 11, 10, 9},
&nbsp;        {8, 7, 6, 5},
&nbsp;        {4, 3, 2, 1}}
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output</strong>: 12 11 10 9 5 1 2 3 4 8
</span></pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Your Task:</strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Complete the function <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">boundaryTraversal()&nbsp;</strong>that takes matrix, n and m&nbsp;as input parameters and returns the list of integers that form<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">&nbsp;</strong>the boundary traversal of the matrix in a clockwise manner.</span><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Time Complexity:</strong>&nbsp;O(N&nbsp;+ M)<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Auxiliary Space:</strong>&nbsp;O(1)</span><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Constraints:</strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1 &lt;= n, m&lt;= 1000<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">0 &lt;= matrix<sub speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">i</sub> &lt;= 1000</span></p></div>