# AVL Tree Deletion
## Hard
<div class="problems_problem_content__Xm_eO" speechify-initial-font-family="Roboto, sans-serif" speechify-initial-font-size="16px"><p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;"><span style="font-size: 17px; font-family: urw-din;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Given an <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">AVL tree</strong> and <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">N</strong> values to be deleted from the tree. Write a function to delete a given value from the tree. All the <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">N</strong> values which needs to be deleted are passed one by one as input <strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">data </strong>by driver code itself, you are asked to return the root of modified tree after deleting the value.</span></p>
<pre speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 17px; font-family: urw-din;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px" style="font-family: urw-din; font-size: 17px;">Example 1:
</strong>
Tree = 
        4
      /   \
     2     6
    / \   / \  
   1   3 5   7</span>

<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">N = 4
Values to be deleted = {4,1,3,6}</span>

<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input: </strong>Value to be deleted = 4
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong>
        5    
      /   \
     2     6
    / \     \  
   1   3     7</span>

<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input: </strong>Value to be deleted = 1
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong>
        5    
      /   \
     2     6
      \     \  
       3     7</span>

<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input: </strong>Value to be deleted = 3
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong>
        5    
      /   \
     2     6
            \  
             7</span>

<span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Input: </strong>Value to be deleted = 6
<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Output:</strong>
        5    
      /   \
     2     7</span>

</pre>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Your Task: &nbsp;</strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">You dont need to read input or print anything. Complete the function<strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"> delelteNode()</strong> which takes the root of the tree and the value of the node to be deleted as input parameters and returns the root of the modified tree.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Note:&nbsp;</strong>The tree will be checked after each deletion.&nbsp;<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">If it violates the properties of balanced BST, an error message will be printed followed by the inorder traversal of the tree at that moment.<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">If instead all deletion are successful, inorder traversal of tree will be printed.<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">If every single node is deleted from tree, 'null' will be printed.</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Time Complexity:</strong> O(height of tree)<br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Expected Auxiliary Space: </strong>O(height of tree)</span></p>
<p speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><span style="font-size: 18px;" speechify-initial-font-family="urw-din" speechify-initial-font-size="17px"><strong speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">Constraints:</strong><br speechify-initial-font-family="urw-din" speechify-initial-font-size="17px">1 ≤ N ≤ 500</span></p></div>