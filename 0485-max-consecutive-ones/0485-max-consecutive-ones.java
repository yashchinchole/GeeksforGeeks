class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int right = 0;
        int count = 0;
        int maxcount = 0;
        
        while(right<n)
        {
            if(nums[right]==1)
            {
                count++;
            }
            maxcount= Math.max(maxcount,count);
            if(nums[right]==0)
            {
                count=0;
            }
            right++;
        }
        return maxcount;
    }
}