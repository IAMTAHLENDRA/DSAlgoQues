class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart=0;
        int preEnd = preorder.length-1;
        int inStart = 0;
        int inEnd = inorder.length-1;
        
        return build(preStart,preEnd,inStart,inEnd,preorder,inorder);
    }
    
    public TreeNode build(int preStart, int preEnd, int inStart, int inEnd, int[] preorder , int[] inorder) {
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
            
        
        int val = preorder[preStart];
        TreeNode ans = new TreeNode(val);
        
        int k=0;
        for(int i=0;i<inorder.length;i++) {
            if(val == inorder[i]) {
                k=i;
                break;
            }
        }
        
        ans.left = build(preStart+1,preStart+(k-inStart),inStart,k-1,preorder,inorder);
        ans.right = build(preStart+(k-inStart)+1,preEnd,k+1,inEnd,preorder,inorder);
        
        return ans;
    }
}