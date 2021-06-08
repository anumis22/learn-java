package microsoft.practice;

public class MakeZeros {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 45, 0, 81},
            {6, 7, 2, 82, 8},
            {20, 22, 49, 5, 5},
            {0, 23, 50, 4, 92}
        };
        print_matrix(matrix);
        /*verify(matrix);
        print_matrix(matrix);

        matrix = create_random_matrix(5, 5);
        print_matrix(matrix);
        verify(matrix);
        print_matrix(matrix);

        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                matrix = create_random_matrix(i, j);
                verify(matrix);
            }
        }*/
    }

    static void print_matrix(int[][] matrix) {
        for(int i=0;i<matrix.length; i++){
            for(int j=0;j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" \t");
            }
            System.out.println();
        }
    }

    static void updateMatrix(int[][] A){
        int rowLen = A.length;
        if(rowLen == 0) return;
        int colLen = A[0].length;

        boolean firstRow =scanRow(A, 0);
        boolean firstCol =scanCol(A, 0);
        for(int i=0;i<rowLen; i++){
            for(int j=0;j<colLen; j++) {
                if(A[i][j] == 0) {
                    int rowIndex = i;
                    int colIndex = j;

                }
            }
        }
    }

    static boolean scanRow(int[][] matrix, int row_num) {
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[row_num][j] == 0)
                return true;
        }
        return false;
    }

    static boolean scanCol(int[][] matrix, int col_num) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col_num] == 0)
                return true;
        }
        return false;
    }
}
