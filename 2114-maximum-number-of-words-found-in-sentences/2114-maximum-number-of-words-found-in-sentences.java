class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (int i = 0; i < sentences.length; i++) {
            int sum = 1;
            for (char c : sentences[i].toCharArray())
                if (c == ' ')
                    sum++;
            ans = (ans > sum) ? ans : sum;
        }
        return ans;
    }
}