class Solution {
    public boolean isBalanced(TreeNode root) {
        if(balancedHeight(root) > -1) return true;
        return false;
    }

    public int balancedHeight(TreeNode root) {
        if(root == null) return 0;

        int h1 = balancedHeight(root.right);
        int h2 = balancedHeight(root.left);

        if(h1 == -1 || h2 == -1) return -1;
        if(Math.abs(h1-h2) > 1) return -1;
        if(h1>h2) return h1+1;
        return h2+1;
    }
}