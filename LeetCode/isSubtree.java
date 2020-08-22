class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
        return  s!=null && ( isBoolean(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t));
    }
    
    public boolean isBoolean(TreeNode s , TreeNode t) {
        boolean result = false;
        if(s==null && t == null) return true;
        if(s==null|| t==null) return false;
        if(s.val == t.val) result = true;
        boolean l1 = isBoolean(s.left,t.left);
        boolean r1 = isBoolean(s.right,t.right);
        
        if(result == true && l1 == true && r1 == true) return true;
        return false;
    }
    
}