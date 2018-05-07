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

                // TODO 08: Wait for each thread

                // TODO 09: Get the minimum of both results

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
