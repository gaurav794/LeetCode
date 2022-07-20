/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
    {
    
    List<Integer> list = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    
    public List<Integer> inorderTraversal(TreeNode root) 
    {
       TreeNode cur = root;
       //start from the root and go through all the left sub trees.
       while( cur != null || stack.empty() == false)
       {
           /*Add al the nodes to stack of all left subtrees. When reached at the end where left value is null then remove that node having left value null from the stack.
             Add the node value to the list
             check the right sub trees
             Keep doing the steps until stack is empty
             left root right
           */
            while(cur !=null)
            {
               stack.push(cur);
               cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;        
       }
        return list;
    }
    
}