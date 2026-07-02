class Solution {
    public int maxArea(int[] height) {
        int max_water=0;
        int curr_water=0;
        int i=0,j=height.length-1;
        while(i<j){
            int w=j-i;
            int h=Math.min(height[i],height[j]);
        curr_water=w*h;
        max_water=Math.max(curr_water,max_water);
        if(height[i]<height[j]){
            i++;
        }else{
            j--;
        }
        }
        return max_water;
    }
}