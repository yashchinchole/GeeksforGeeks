# Nodes at given distance in binary tree
## Hard
<div class="problems_problem_content__Xm_eO" speechify-initial-font-family="Roboto, sans-serif" speechify-initial-font-size="16px"><p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Given a binary tree, a target node in the binary tree, and an integer value k, find all the nodes that are at distance k from the given target node. No parent pointers are available.<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Note</strong>: </span></p>
<ul speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">
<li speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">You have to return the list in sorted order.</span></li>
<li speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">The tree will <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">not </strong>contain <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">duplicate </strong>values.</span></li>
</ul>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 1:</span></strong></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input:      </strong>
          20
        /    \
      8       22 
    /   \
   4    12 
       /   \
      10    14</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Target Node = 8
K = 2</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong> 10 14 22</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Explanation: </strong>The three nodes at distance 2
from node 8 are 10, 14, 22.</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><img style="height: 240px; width: 173px;" src="https://media.geeksforgeeks.org/wp-content/uploads/20190426123252/Btree1.jpg" alt="" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"></span>
</pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 2:</strong></span></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input:      </strong>
         20
       /    \
      7      24
    /   \
   4     3
        /  
       1    </span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Target Node = 7
K = 2</span>
<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong> 1 24</span>
</pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Your Task: &nbsp;</strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">You don't need to read input or print anything. Complete the function<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"> KDistanceNodes()</strong> which takes the root of the tree, target, and K as input parameters and returns a list of nodes at k distance from target in a sorted order.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Time Complexity: </strong>O(N*logN)<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Auxiliary Space: </strong>O(Height of tree)</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Constraints:</strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1 ≤ N ≤ 10<sup speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">5</sup><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1 ≤ data of node ≤ 10<sup speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">9</sup><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1 ≤ target ≤ 10<sup speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">9</sup><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1 ≤ k ≤ 20</span></p></div>