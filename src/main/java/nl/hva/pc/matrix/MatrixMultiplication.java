package nl.hva.pc.matrix;

/**
 * Matrix Multiplication:
 *
 * A schematic example of task decomposition based on data.
 * This class has a static method that receives two matrices
 * as an input parameter and return the multiplied matrix
 */
public class MatrixMultiplication {

    public static int [][] multiply(int [][] a, int [][] b) {
        int[][] c = new int[a.length][b[0].length];

        /* TODO 01: Get familiar with the matrix multiplication technique
           visit https://www.mathsisfun.com/algebra/matrix-multiplying.html */

        // TODO 02: Create your worker threads here
        Thread[][] workers = new Thread[a.length][b[0].length];

        // TODO 03: Start your worker threads here
        for(int i=0; i<workers[0].length; i++){
            // create and start new WorkerThreads for each ith row and jth column
            for(int j=0; j<workers.length; j++){
                workers[i][j] =   new Thread( new MultiplicationThread(i,j,a,b,c) );
                workers[i][j].start();
            }
        }

        // TODO 04: Wait for worker threads to complete
        for (int i=0; i<workers.length; i++) {

            for(int j=0; j<workers[i].length; j++){
                try {
                    workers[i][j].join();
                } catch (InterruptedException ie) { }
            }
        }

        return c;
    }
}
