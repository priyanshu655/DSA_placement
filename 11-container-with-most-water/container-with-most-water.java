class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_water=Integer.MIN_VALUE;

        while(left<right){
            int curr_height=Math.min(height[left],height[right]);
            int width=right-left;
            int curr_water=curr_height*width;
            max_water=Math.max(curr_water,max_water);

           if(height[left]>height[right]){
            right--;
           }else{
            left++;
           }
        }
        return max_water;
    }
}