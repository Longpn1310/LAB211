/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0074;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Option {
        Validate ld = new Validate();
    static void prepare(char x){
        MatrixOperation run = new MatrixOperation();
        int row1 = Validate.checkInt("Enter Row Matrix 1: ", 1, Integer.MAX_VALUE);
        int col1 = Validate.checkInt("Enter Coumn Matrix 1: ", 1, Integer.MAX_VALUE);
        int[][] matrix1 = new int[row1][col1];
        input(matrix1, row1, col1);
        int row2, col2;
        if(x=='+'||x=='-'){
            System.out.println("Input element of Matrix 2");
            row2 = row1;
            col2 = col1;
        }
        else{
            System.out.println("Input element of Matrix 2");
            col2 = row1;
            row2= row1;
        }
        int[][] matrix2 = new int[row2][col2];
        input(matrix2, row2, col2);
        int[][] matrix;
        if (x == '+' || x == '-') {
            if (x == '+') {
                matrix = run.addMatrix(matrix1, matrix2);
            } else {
                matrix = run.subMatrix(matrix1, matrix2);
            }

        } else {
            matrix = run.mulMatrix(matrix1, matrix2);
        }
        System.out.println("------- Result -------");
        output(matrix1);
        System.out.println(x);
        output(matrix2);
        System.out.println("=");
        output(matrix);
    }

    
    public static void input(int[][] matrix, int row, int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = Validate.checkInt("Enter element["+(i+1)+"]["+(j+1)+"] ", -1000, 1000); 
                /* lay gioi han -1000 va 1000 de test  */
            }
        }
    }
    
    public static void output(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print("["+matrix[i][j]+"] ");
            }
            System.out.println("");
        }
    }
}
