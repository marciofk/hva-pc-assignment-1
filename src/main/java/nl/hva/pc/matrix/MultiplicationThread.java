package nl.hva.pc.matrix;

/**
 * A schematic working thread that multiplies lines and rows of two matrices and
 * update the corresponding row and col of the new matrix
 */
public class MultiplicationThread extends Thread {

    private int row;
	private int col;
	private int[][] a;
	private int[][] b;
	private int[][] c;

    /**
     *
     * @param row new row
     * @param col new col
     * @param a the first matrix
     * @param b the second matrix
     * @param c the resulting matrix
     */
	public MultiplicationThread(int row, int col, int[][] a, int[][] b, int[][] c) {
		this.row = row;
		this.col = col;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void run() {

		// TODO 05: calculate the value of c[row][col]

	}

}