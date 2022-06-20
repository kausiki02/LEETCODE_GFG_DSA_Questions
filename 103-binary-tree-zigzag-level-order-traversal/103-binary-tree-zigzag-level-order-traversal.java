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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>>wraplist = new ArrayList<>();
        
        if(root == null) return wraplist;
        
        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            int levelnum = queue.size();
            ArrayList<Integer>sublist = new ArrayList<Integer>(levelnum);
            
            for(int i=0; i<levelnum; i++){
                int index = i;
                if(queue.peek().left!=null) 
                    queue.offer(queue.peek().left);
                if(queue.peek().right!=null) 
                    queue.offer(queue.peek().right);
                if(flag==true) 
                    sublist.add(queue.poll().val);
                else
                    sublist.add(0,queue.poll().val);
            }
            
            flag =!flag;
            wraplist.add(sublist);
        }
        return wraplist;
    }
}