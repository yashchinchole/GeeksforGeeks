# Duplicate subtree in Binary Tree
## Medium
<div class="problems_problem_content__Xm_eO" speechify-initial-font-family="Roboto, sans-serif" speechify-initial-font-size="16px"><p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Given a binary tree, find out whether it&nbsp;contains a duplicate sub-tree of size two&nbsp;or more, or not.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Note:</strong> Two same leaf nodes are not considered as subtree as size of a leaf node is one.&nbsp;</span><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 1 :</strong></span></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input : </strong>
               1
             /   \ 
           2       3
         /   \       \    
        4     5       2     
                     /  \    
                    4    5
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output :</strong> 1
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Explanation : </strong>
    2     
  /   \    
 4     5
is the duplicate sub-tree.</span></pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Example 2 :</span></strong></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input : </strong>
               1
             /   \ 
           2       3
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output: </strong>0
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Explanation:</strong> There is no duplicate sub-tree 
in the given binary tree.</span></pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Your Task:&nbsp;&nbsp;</strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">dupSub()</strong>&nbsp;which takes root of the tree as the only argument and returns 1 if the binary tree contains a duplicate sub-tree of size two&nbsp;or more, else 0.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Time Complexity:</strong> </span><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">O(N)<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"></span><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Space Complexity:</strong> O(N)</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Constraints:</strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">0 ≤ Number of nodes ≤ 9</span><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">&nbsp;</p></div>