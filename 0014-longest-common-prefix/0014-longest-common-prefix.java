class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String ans = strs[0];
        for (int i = 1; i < n; i++) {
            while (strs[i].indexOf(ans) != 0) {
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        if (ans.length() == 0)
            return "";
        return ans;
    }
}