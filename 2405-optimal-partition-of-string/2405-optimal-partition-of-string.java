class Solution {
    public int partitionString(String s) {
        int p = 0;
        Map<Character, Integer> u = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (u.getOrDefault(s.charAt(i), 0) > 0) {
                p++;
                u.clear();
            }
            u.put(s.charAt(i), u.getOrDefault(s.charAt(i), 0) + 1);
        }
        return p + 1;
    }
}