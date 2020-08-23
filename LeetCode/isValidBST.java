class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root,Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
    }
    
    public boolean check(TreeNode a,double min, double max) {
        if(a==null) return true;
        
        if(a.val<=min || a.val >=max) return false;
        
        return check(a.left,min,a.val)&&check(a.right,a.val,max);
    }
}