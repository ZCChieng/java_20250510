public class _26MultiDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Print the elements of the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : matrix) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }

}
