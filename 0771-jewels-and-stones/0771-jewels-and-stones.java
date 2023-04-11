class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] count = new int[128];
        int ans = 0;
        for (char c : S.toCharArray())
            count[c]++;
        for (char c : J.toCharArray())
            ans += count[c];
        return ans;
    }
}