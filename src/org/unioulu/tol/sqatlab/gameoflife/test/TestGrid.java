package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.unioulu.tol.sqatlab.gameoflife.*;
import org.junit.Test;
import org.junit.Before;

public class TestGrid {

	private Grid grid;
	
	@Before
	public void setup() {
		
	}
	
	@Test
	public void testGridIsSquare10x10() {
		try {
			grid = new Grid(10, 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(grid.getHeight(), grid.getHeight());
	}
	
	@Test
	public void testGridIsNotSquare10x9() {
		boolean thrown = false;
		try {
			grid = new Grid(10, 9);
		} catch (Exception e) {
			thrown = true;	
		}
		
		assertEquals(true, thrown);
	}
	
	@Test
	public void testGridIsNotSquare9x10() {
		boolean thrown = false;
		try {
			grid = new Grid(9, 10);
		} catch (Exception e) {
			thrown = true;	
		}
		
		assertEquals(true, thrown);
	}

}
