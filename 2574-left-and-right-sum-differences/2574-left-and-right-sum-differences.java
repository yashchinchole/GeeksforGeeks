class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int leftSum = 0;
        int rightSum = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++)
        {
            ans[i] = Math.abs(leftSum - rightSum + nums[i]);
            leftSum += nums[i];
            rightSum -= nums[i];
        }
        return ans;    
    }
}