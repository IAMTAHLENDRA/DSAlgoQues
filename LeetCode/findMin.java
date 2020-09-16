class Solution {
    public int findMin(int[] nums) {
        int size = nums.length;
        int min=nums[0];
        
        for(int i=0;i<size;i++) {
            if(nums[i]<min) {
                min=nums[i];
            }
        }
        
        return min;
    }
}