class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel= new ArrayList<>();
            
            for(int i = 0;i < size;i++) {
                TreeNode curr = queue.remove();
                currentLevel.add(curr.val);
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            
            result.add(currentLevel);
        }
        return result;
        
    }
}