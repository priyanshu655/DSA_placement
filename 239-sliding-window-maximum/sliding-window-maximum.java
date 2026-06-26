class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>deque=new LinkedList<>();
        int res[]=new int[nums.length-k+1];
        for(int right=0;right<nums.length;right++){
            while(!deque.isEmpty()&&deque.peekFirst()<=right-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[right]){
                deque.pollLast();
            }
            deque.addLast(right);
            if(right>=k-1){
                res[right-k+1]=nums[deque.peekFirst()];
            }
        }
        return res;
    }
}