package nl.hva.pc.min;

public class FindMinimum {

    public static int findMinimum(int[] data) {

        return findMinimum(data, 0, data.length - 1);
    }

    public static int findMinimum(int[] data, int from, int to) {
        try {
            MinimumRunner r = new MinimumRunner(data, from, to);

            r.start();
            r.join();

            return r.getMin();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

class MinimumRunner extends Thread {

    private final int[] data;
    private int from;
    private int to;
    private int min;

    public MinimumRunner(int[] data, int from, int to) {
        this.data = data;
        this.from = from;
        this.to = to;
        this.min = Integer.MAX_VALUE;
    }

    public int getMin() {
        return min;
    }

    @Override
    public void run() {

        try {
            if (from == to) {
                min = data[from];
            } else {


                // TODO 07: create and start two threads to discover the minimum number,
                // one for the left-hand side part of the array
                // another for the right-hand side part of the array

                // left-hand-side slice
                int f1 = from;
                int t1 = to / 2 < f1 ? f1 : to / 2;
                MinimumRunner r1 = new MinimumRunner(data, f1, t1);
                r1.start();

                // left-hand-side slice
                int f2 = t1 + 1;
                int t2 = to;
                MinimumRunner r2 = new MinimumRunner(data, f2, t2);
                r2.start();

                // TODO 08: Wait for each thread

                r1.join();
                r2.join();

                // TODO 09: Get the minimum of both results

                if (r1.min < r2.min) {
                    min = r1.min;
                } else {
                    min = r2.min;
                }

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
