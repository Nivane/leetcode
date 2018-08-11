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
    public List<List<Integer>> levelOrder(TreeNode root) { 
        if(root == null){
            return new ArrayList<>();
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> line = new ArrayList<>(); //存储行元素
        List<List<Integer>> res = new ArrayList<>();//存储所有行
        int current = 1;//当前层数元素数量
        int next = 0;//下一层元素数量
        while(!queue.isEmpty()){
            
            TreeNode node = queue.poll();
            line.add(node.val);
            current--;
            if(node.left != null){
                queue.add(node.left);
                next++;
            }
            
            if(node.right != null){
                queue.add(node.right);
                next++;
            }
            
            if(current == 0){
                res.add(line);
                line = new ArrayList<>();
                current = next;
                next = 0;
            }
            
        }
        
        return res;
        
        
        
        
    }
}