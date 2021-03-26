/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul2;

/**
 *
 * @author HP
 */
public class nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrix [][] = {
            {34, 56, 41},
            {45, 36, 37},
            {51, 32, 46}
        };
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(matrix[1][0]);
        System.out.println();
        System.out.println("Sutrisno");
            }
        }
