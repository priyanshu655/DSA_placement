class Solution {
    public int longestOnes(int[] nums, int k) {
       int left=0;
       int zero_count=0;
       for(int r=0;r<nums.length;r++){
        if(nums[r]==0){
            zero_count++;
        }
            if(zero_count>k){
                if(nums[left]==0){
                    zero_count--;
                }
                left++;
            }
        
       }
       return nums.length-left;
    }
}