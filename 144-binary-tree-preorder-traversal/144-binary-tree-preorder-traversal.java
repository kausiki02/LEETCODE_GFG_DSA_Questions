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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> bt = new ArrayList<Integer>();
        preorder(root,bt);
        return bt;
        
        
    }
    
    public void preorder(TreeNode root,List<Integer> bt){
        if(root == null){
            return;
        }
        bt.add(root.val);
        preorder(root.left,bt);
        preorder(root.right,bt);
    }
}