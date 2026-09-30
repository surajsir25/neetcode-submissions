class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int min = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int max = rows*columns - 1;
        while(min <= max) {
            int mid = min + (max - min)/2;
            int i,j;
            i = mid/columns;
            j = mid%columns;
            if(target == matrix[i][j]){
                return true;
            }
            else if(target > matrix[i][j]){
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return false;
    }
}