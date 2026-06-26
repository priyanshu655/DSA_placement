class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int prefix_sum=0;
        for(int right=0;right<nums.length;right++){
            prefix_sum+=nums[right];
            int target=prefix_sum-k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(prefix_sum,map.getOrDefault(prefix_sum,0)+1);
        }
        return count;
    }
}