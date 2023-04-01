class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        int n  = nums.length;
        int l = 0;
        int r = n - 1;
        int m = (l + r) / 2;
        
        while(nums[m] != target && l <= r)
        {
            if(target > nums[m])
                l = m + 1;
            else
                r = m - 1;
            m = (l + r) / 2;
        }
        if(l <= r)
            ans = m;
        return ans;
    }
}