class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                ans=Math.min(ans,r-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}