class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] i : matrix){
            for(int j:i){
                if(target == j)return true;
            }
        }
        return false;
    }
}