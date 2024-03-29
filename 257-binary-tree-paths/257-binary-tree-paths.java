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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root==null) return null;
        helper(root, "", res);
        
        return res;
    }
    
    private void helper(TreeNode root, String str, List<String> res){
        
        str = str+ root.val;
        
        if(root.left==null && root.right == null)
            res.add(str); // reach a leaf node , completes a path
        
        if(root.left!=null)
            helper(root.left, str+"->", res); //recursively checks left child
        
        if(root.right!=null)
            helper(root.right, str+"->", res); //recursively checks right child
    }
}