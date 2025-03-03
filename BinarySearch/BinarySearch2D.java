package BinarySearch;
import java. util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {11, 21, 31, 41},
                {12, 22, 32, 42},
                {13, 23, 33, 43}
        };
        int target = 32;
        System.out.println(Arrays.toString(search(matrix, target)));

    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;
        while(row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[]{row, col};
            }else if(matrix[row][col] > target ){
                col --;
            }
            else
                row++;
        }
        return new int[]{-1,-1};
    }
}
