/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    
//     public int maxDepth(TreeNode root) {
//         if(root == null){
//             return 0;
//         }
        
//         return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);

//     }
    
    int res = 0;
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
            
        int depth = 1;
        max(root, depth);
        return res;
    }
    
    private void max(TreeNode root, int depth){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            res = Math.max(res, depth);
        }
        max(root.left, depth + 1);
        max(root.right, depth + 1);
    }
    
    
    
}