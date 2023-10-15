class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i= m - 1, j=0;
        while(i >= 0 && j < n) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                i--;
            else
                j++;
        }
        return false;
    }
}