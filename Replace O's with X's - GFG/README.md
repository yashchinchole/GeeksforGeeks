# Replace O's with X's
## Medium
<div class="problems_problem_content__Xm_eO" speechify-initial-font-family="Roboto, sans-serif" speechify-initial-font-size="16px"><p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;"><span style="font-size: 17px; font-family: urw-din;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Given a matrix <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">mat</strong> of size <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">N x M</strong> where every element is either 'O' or 'X'. Replace all 'O' with 'X' that are surrounded by 'X'. </span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;"><span style="font-size: 17px; font-family: urw-din;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;"><span style="font-size: 17px; font-family: urw-din;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 1:</span></strong></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">Input:</strong> <br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">n = 5, m = 4
mat = {{'X', 'X', 'X', 'X'}, 
&nbsp;      {'X', 'O', 'X', 'X'}, 
&nbsp;      {'X', 'O', 'O', 'X'}, 
&nbsp;      {'X', 'O', 'X', 'X'}, 
&nbsp;      {'X', 'X', 'O', 'O'}}
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">Output:</strong> <br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">ans = {{'X', 'X', 'X', 'X'}, 
&nbsp;      {'X', 'X', 'X', 'X'}, 
&nbsp;      {'X', 'X', 'X', 'X'}, 
&nbsp;      {'X', 'X', 'X', 'X'}, 
&nbsp;      {'X', 'X', 'O', 'O'}}
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Explanation:</strong> <br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Following the rule the above matrix is the resultant matrix. </span>
</pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 2:</span></strong></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">&nbsp;</p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input:</strong> <br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">n = 5, m = 4
mat = {{'X', 'O', 'X', 'X'}, 
&nbsp;      {'X', 'O', 'X', 'X'}, 
&nbsp;      {'X', 'O', 'O', 'X'}, 
&nbsp;      {'X', 'O', 'X', 'X'}, 
&nbsp;      {'X', 'X', 'O', 'O'}}
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong> <br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">ans = {{'X', 'O', 'X', 'X'}, 
&nbsp;      {'X', 'O', 'X', 'X'}, 
&nbsp;      {'X', 'O', 'O', 'X'}, 
&nbsp;      {'X', 'O', 'X', 'X'}, 
&nbsp;      {'X', 'X', 'O', 'O'}}
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Explanation:</strong> <br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Following the rule the above matrix is the resultant matrix.</span></pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Your Task:</strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">You do not need to read input or print anything. Your task is to complete the function <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">fill()</strong> which takes <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">N</strong>, <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">M</strong> and <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">mat</strong> as input parameters ad returns a 2D array representing the resultant matrix.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Time Complexity:</strong> O(n*m)<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Auxiliary Space:</strong> O(n*m)</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Constraints:</strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1 ≤ n, m ≤ 500</span></p></div>