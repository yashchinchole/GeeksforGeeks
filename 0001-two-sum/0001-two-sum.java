class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int b = nums[i];
            int a = target - b;
            if (map.containsKey(a))
                return new int[] { map.get(a), i };
            map.put(b, i);
        }
        return new int[] {};
    }
}