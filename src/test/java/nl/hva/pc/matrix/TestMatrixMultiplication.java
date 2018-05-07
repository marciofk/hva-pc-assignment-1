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

        assertEquals(Arrays.deepToString(c).hashCode(),1514016271);
    }
}
