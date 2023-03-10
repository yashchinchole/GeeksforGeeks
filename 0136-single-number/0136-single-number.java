class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int N =nums.length;
        int ans =0;
        boolean flag=false;
        int last =nums[N-1];
        for(int i=0;i<N-2;i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
                ans = nums[i];
                flag =true;
                break;
            }
        }
        if(!flag)
        return last;
        else
        return ans;   
    }
}