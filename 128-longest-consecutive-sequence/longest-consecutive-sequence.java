import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Put all numbers into HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Iterate through unique numbers
        for (int num : set) {

            // Only start if this is the beginning of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}