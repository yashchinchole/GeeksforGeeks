public class Solution {
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                goodPairs += count;
                map.put(nums[i], count + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return goodPairs;
    }
}