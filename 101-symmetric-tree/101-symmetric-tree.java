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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetricHelp(root.left, root.right);
        
    }
    
    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left == null || right == null) return left == right; //both the values are not 
        //same therefore not symmetric
        if(left == null && right == null) return true; //both symmetric even if null
        
        if(left.val != right.val) return false;
        
        return isSymmetricHelp(left.left , right.right) && isSymmetricHelp(left.right,right.left);
        
        
    }
      
      
    }