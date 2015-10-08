package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	
	private int width, height;
	
	public Grid(int x, int y) throws CustomLifeException {
		width = x;
		height = y;
		if(width != height) {
			throw new CustomLifeException("Grid is not square");
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
}
