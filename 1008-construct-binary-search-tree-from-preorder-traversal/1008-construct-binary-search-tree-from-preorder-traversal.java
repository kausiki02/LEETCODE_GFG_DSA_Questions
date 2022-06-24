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
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null) return null;
        
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 1) return root;
        
        for (int i = 1; i < preorder.length; i++) {
            insertToBst(root, preorder[i]);
        }
        return root;        
    }
    
    private void insertToBst(TreeNode node, int value) {
        if (node == null) return;
        
        if (node.val < value) {
            if (node.right == null) {
                node.right = new TreeNode(value);
            } else {
                insertToBst(node.right, value);
            }
        } else {
            if (node.left == null) {
                node.left = new TreeNode(value);
            } else {
                insertToBst(node.left, value);
            }
        }
}
}