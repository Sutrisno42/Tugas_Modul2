
package tugasmodul2;

public class nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] A = {
            {2, 6},
            {3, 1},
            {4, 5}
        };
        int [][] B = {
            {6, 7},
            {7, 3},
            {8, 9}
        };
        if ((A.length == B.length) && (A[0].length == B[0].length)) {
            int [][] C = new int [A.length][A[0].length];
            for (int i=0; i<A[0].length; i++){
                for(int j=0; j<A[0].length; j++){
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
            for (int[] c:C){
                for(int q:c){
                    System.out.print(q + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Ukuran matrix tidak sama");

        }
    }
}
