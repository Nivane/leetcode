/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//迭代实现
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> list = new LinkedList<>();
//         if(root == null)
//             return list;
        
//         Stack<TreeNode> stack = new Stack<>();
//         TreeNode node = root;
        
//         while(node != null) {
//             list.add(0, node.val);
            
//             if(node.left != null) {
//                 stack.push(node.left);
//             }
            
//             node = node.right;
//             if(node == null && !stack.isEmpty()) {
//                 node = stack.pop();
//             }
//         }
        
//         return list;
//     }
// }

class Solution {
    
    List<Integer> list;
    
    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<Integer>();
        traverse(root);
        return list;
    }
    
    private void traverse(TreeNode root){
        
        if(root == null){
            return;
        }
        
        traverse(root.left);
        traverse(root.right);
        list.add(root.val);
    }
    
}