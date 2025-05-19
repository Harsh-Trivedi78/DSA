/**
 * RoateMatrix
 */
public class RoateMatrix {
    public static int[][] rotateMatrix(int[][]matrix){
        int n = matrix.length;
        int[][] result = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n; j++){
                result[j][n-i-1] = matrix[i][j];

            }
        }
        return result;
    }
    

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] rotated = rotateMatrix(matrix);

        System.out.println("Rotated Matrix (90 degrees clockwise):");
        printMatrix(rotated);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}