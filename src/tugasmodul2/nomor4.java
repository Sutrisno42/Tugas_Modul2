
package tugasmodul2;

import java.util.Scanner;


public class nomor4 {


    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,m,n;
        int matrix [][]= new int [10][10];
        int transpose [][] = new int [10][10];
        Scanner sc= new Scanner (System.in);
        System.out.println("Masukkan Jumlah baris matrix");
        m=sc.nextInt();
        System.out.println("Masukkan jumlah kolom matrix");
        n=sc.nextInt();
        System.out.println("Masukkan elemen matrix");
        for (i=0; i<m; i++){
            for (j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for (i=0; i<m; i++){
            for (j=0; j<n; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Hasil transpose matrix");
        for (i=0; i<n; i++){
            for (j=0; j<m; j++){
                System.out.println(transpose[i][j]+ "\t");
            }
            System.out.println();
            }
        }
        
    }
