package p0074;

public class MatrixOperation {

    public int[][] addMatrix(int[][] matrix1, int[][] matrix2){
        int [][] matrix = new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        return matrix;
    }
    
    public int[][] subMatrix(int[][] matrix1, int[][] matrix2){
        int [][] matrix = new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = matrix1[i][j]-matrix2[i][j];
            }
        }
        return matrix;
    }
    
    public int[][] mulMatrix(int[][] matrix1, int[][] matrix2){
        int [][] matrix = new int[matrix1.length][matrix2[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = 0;
                
                /* TINH GIA TRI MA TRAN MOI O VI TRI I, J */
                for(int k=0;k<matrix2.length;k++){
                    matrix[i][j] += matrix1[i][k]*matrix2[k][j];
                }
                
            }
        }
        return matrix;
    } 
}



//[1][2]    *   [5][6][7]    =    [21][24][7]
//[3][4]        [8][9][0]         [][][]