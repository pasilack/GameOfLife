package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	private boolean state = false;
	
	public boolean isDead() {
		if(state == false) {
			return true;
		}
		return false;
	}
	
	public void setAlive() {
		state = true;
	}
	
	public void setDead() {
		state = false;
	}
}
