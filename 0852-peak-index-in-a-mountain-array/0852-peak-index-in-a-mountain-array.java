class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int top = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            top = left + (right - left) / 2;
            if (arr[top] < arr[top + 1])
                left = top + 1;
            else
                right = top;
        }
        return left;
    }
}