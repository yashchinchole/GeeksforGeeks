class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans = false;
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1, s2))
            ans = true;
        return ans;
    }
}