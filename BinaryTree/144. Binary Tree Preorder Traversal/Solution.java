/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//可以通过Stack循环
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<Integer>();
//         Stack<TreeNode> stack = new Stack<TreeNode>();
//         TreeNode cur = root;
//         while (cur != null) {
//             ans.add(cur.val);
//             if (cur.right != null) {
//                 stack.push(cur.right);
//             }
//             cur = cur.left;
//             if (cur == null && !stack.empty()) {
//                 cur = stack.pop();
//             }
//         }
//         return ans;
//         /*
//         List<Integer> ans = new ArrayList<Integer>();
//         preorderRecursive(root, ans);
//         return ans;
//         */
//     }



class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(root.val);
        
        if(root.left != null){
            list.addAll(preorderTraversal(root.left));
        }
        
        if(root.right != null){
            list.addAll(preorderTraversal(root.right));
        }
        
        return list;
    }
}