package nl.hva.pc.matrix;

import nl.hva.pc.min.FindMinimum;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMin {

    @Test
    public void testMin() {
        final int seed = 20180507;

        int[] data = Util.random(1000,seed);

        int min = FindMinimum.findMinimum(data);

        /* TODO 10: Find the magic number (actually the hashcode of the stringified version of the calculated matrix)
           To pass the test you must inform the right number, it is not -1 :-) */

        assertEquals(min,-1);
    }
}
