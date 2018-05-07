package nl.hva.pc.matrix;

public class MultiplicationThread extends Thread {

    private int row;
	private int col;
	private int[][] a;
	private int[][] b;
	private int[][] c;
	
	public MultiplicationThread(int row, int col, int[][] a, int[][] b, int[][] c) {
		this.row = row;
		this.col = col;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void run() {
		int sum = 0;
		for(int i = 0; i< a[0].length; i++){
			sum += a[row][i] * b[i][col];
		}
		c[row][col] = sum;
		
	}

}