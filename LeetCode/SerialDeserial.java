public String serialize(TreeNode root) {
        if(root == null) return null;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        StringBuilder s = new StringBuilder();
        
        
        while(!stack.isEmpty()) {
            TreeNode a = stack.pop();
            if(a !=null) {
                s.append(a.val+",");
                stack.push(a.right);
                stack.push(a.left);
                
            } else {
                s.append("#,");
            }
        }
        return s.toString().substring(0, s.length()-1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      if(data == null) return null;
        int[] index = {0};
        String[] arr = data.split(",");
        return buildTree(arr,index);
     }
    
    private TreeNode buildTree(String[] arr, int[] index) {
        if(arr[index[0]].equals("#")) return null;
        
        TreeNode root = new TreeNode(Integer.parseInt(arr[index[0]]));
        
        index[0] += 1;
        root.left = buildTree(arr,index);
        index[0] += 1;
        root.right = buildTree(arr,index);
        return root;
        
    }