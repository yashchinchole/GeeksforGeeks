# Floor in BST
## Medium
<div class="problems_problem_content__Xm_eO" speechify-initial-font-family="Roboto, sans-serif" speechify-initial-font-size="16px"><p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">You are given a BST(Binary Search Tree) with <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">n</strong>&nbsp;number of nodes and value <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">x</strong>. your task is to find the greatest value node of the BST which is smaller than or equal to x.<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Note:</strong> when x is smaller than the smallest node of BST then returns -1.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example:</span></strong></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input:</span></strong><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">
n = 7               2
                     \
                      81
                    /     \
                 42       87
                   \       \
                    66      90
                   /
                 45
x = 87
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong>
87
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Explanation:</strong>
87 is present in tree so floor will be 87.</span>
</pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 2:</span></strong></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input:</strong>
n = 4                     6
                           \
                            8
                          /   \
                        7       9
x = 11
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong>
9</span>
</pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Your Task:-</span></strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">You don't need to read input or print anything. Complete the function <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">floor() </strong>which takes<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">&nbsp;</strong>the integer&nbsp;<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">n</strong>&nbsp;and BST&nbsp;and integer x returns the floor&nbsp;value.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Constraint:</span></strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1 &lt;= Noda data &lt;= 10<sup speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">9</sup><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1 &lt;= n &lt;= 10<sup speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">5</sup></span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Time Complexity:</strong> O(n)<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Space Complexity:</strong> O(1)</span></p></div>