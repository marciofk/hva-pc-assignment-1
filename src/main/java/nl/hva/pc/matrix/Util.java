package nl.hva.pc.matrix;

import java.util.Random;

public class Util {

    public static int[][] random(int m, int n, int seed) {
        Random random = new Random(seed);
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = random.nextInt(1000);
        return a;
    }

    public static int[] random(int n, int seed) {
        Random random = new Random(seed);
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = random.nextInt(Integer.MAX_VALUE);
        return a;
    }
}
