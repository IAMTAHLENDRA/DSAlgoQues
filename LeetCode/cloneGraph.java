class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Map<Integer,Node> map = new HashMap<>();
        return clone(node,map);
    }
    
    private Node clone(Node node,Map<Integer,Node> map) {
        if(map.containsKey(node.val)) return map.get(node.val);
        Node copy = new Node(node.val);
        map.put(node.val,copy);
        for(Node neighbor : node.neighbors) copy.neighbors.add(clone(neighbor,map));
        return copy;
    }
}