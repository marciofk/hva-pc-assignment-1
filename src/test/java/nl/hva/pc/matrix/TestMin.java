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

        assertEquals(min,7692896);
    }
}
