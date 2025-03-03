package BinarySearch;
import java. util.Arrays;
// Binary Search in a 2D array, where the elements in the matrix are sorted in row wise and column wise as well.
public class BinarySearch2D {
    public static void main(String[] args) {
        // 2D array
        int[][] matrix = {
                {10, 20, 30, 40},
                {11, 21, 31, 41},
                {12, 22, 32, 42},
                {13, 23, 33, 43}
        };
        int target = 32; // target element
        System.out.println(Arrays.toString(search(matrix, target))); // function call

    }
    static int[] search(int[][] matrix, int target){
        int row = 0; // first row
        int col = matrix.length - 1; // last col
        while(row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[]{row, col};
            }else if(matrix[row][col] > target ){
                col --;
            }
            else // matrix[row][col] < target
                row++;
        }
        return new int[]{-1,-1};// if target element not found.
    }
}
