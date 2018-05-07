package nl.hva.pc.matrix;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class TestMatrixMultiplication {

    @Test
    public void testMultiplication() {

        final int SEED = 20180507;
        final int M = 100;
        final int N = 100;

        int[][] a = Util.random(M,N, SEED);
        int[][] b = Util.random(M,N, SEED + 1);

        int [][] c = MatrixMultiplication.multiply(a,b);

        /* TODO 06: Find the magic number (actually the hashcode of the stringified version of the calculated matrix)
           To pass the test you must inform the right number, it is not -1 :-) */

        assertEquals(Arrays.deepToString(c).hashCode(),1514016271);
    }
}
