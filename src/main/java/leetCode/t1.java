package leetCode;

/**
 * @author ma
 * @version 1.0 {2019/12/18}
 */
public class t1 {
    public  boolean searchMatrix(int[][] matrix, int target) {
        int h = matrix.length-1;
        int l = 0;
        while (h >= 0 && l < matrix[0].length){
            if(matrix[h][l]<target){
                l++;
            }else if(matrix[h][l]>target){
                h--;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int target = 7;
        System.out.println((new t1()).searchMatrix(matrix, target));
    }
}
