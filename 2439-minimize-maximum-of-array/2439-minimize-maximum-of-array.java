class Solution {
    public int minimizeArrayValue(int[] nums) {
        long preSum = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            ans = Math.max(ans, (int) ((preSum + i) / (i + 1)));
        }
        return ans;
    }
}