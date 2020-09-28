class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int counter =0;
        for(int i=0;i<nums.length;i++) {
            count.put(nums[i],counter++);    
        }
        
        if(count.size() < nums.length) return true;
        return false;
    }
}