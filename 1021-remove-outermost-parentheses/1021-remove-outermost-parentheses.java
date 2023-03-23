class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && count++ > 0) { // outermost left parentheses is not added to result
                result.append(c);
            }
            if (c == ')' && --count > 0) { // outermost right parentheses is not added to result
                result.append(c);
            }
        }
        return result.toString();   
    }
}