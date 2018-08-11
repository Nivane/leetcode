/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 循环方式
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         if (root == null) return list;
        
//         Stack<TreeNode> stack = new Stack<>();
        
//         while (root != null || !stack.isEmpty()) {
//             while (root != null) {
//                 stack.push(root);
//                 root = root.left;
//             }
//             root = stack.pop();
//             list.add(root.val);
//             root = root.right;
//         }
//         return list;
//     }
// }
class Solution {
    List<Integer> list;
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<Integer>();
        traverse(root);  
        return list;
    }
    
    private void traverse(TreeNode root){
        if(root == null){
            return;
        }
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}