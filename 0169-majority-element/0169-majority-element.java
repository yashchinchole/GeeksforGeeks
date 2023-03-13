class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maj = nums[0];
        int ans = 0;
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                count++;
                ans = Math.max(count,ans);
                if(ans == count)
                {
                    maj = nums[i];
                }
            }
            else
                count = 0;
        }
        return maj;
    }
}