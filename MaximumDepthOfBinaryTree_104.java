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
    public int maxDepth(TreeNode root) {

        // in case of leaf node, height is 0 there
        // if its not a leaf node, it returns the greatest of left or right height to the parent

        if(root == null)
        {
            return 0;
        }
        else
        {
            return max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    public static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
}