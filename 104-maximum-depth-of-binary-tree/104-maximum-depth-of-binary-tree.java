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
class Solution {
    // int max = 0;
    // int current = 0;
    public int maxDepth(TreeNode root) 
    {
        //O(n)
        int leftHeight = 0, rightHeight = 0;
        if(root == null) return 0;
        
		if (root.left != null) {
			leftHeight = maxDepth(root.left);
		}

		if (root.right != null) {
			rightHeight = maxDepth(root.right);
		}

        return 1 + Math.max(leftHeight, rightHeight);

    }
}