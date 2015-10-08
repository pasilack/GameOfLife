package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.unioulu.tol.sqatlab.gameoflife.*;
import org.junit.Test;
import org.junit.Before;
import org.easymock.EasyMock;

public class TestCell {
	
	private Cell testCell;
	
	@Before
	public void setup() {
		testCell = new Cell();
	}
	
	@Test
	public void testCellIsDead() {
		assertEquals(true, testCell.isDead());
	}
	
	@Test
	public void testCellIsAlive() {
		testCell.setAlive();
		assertEquals(false, testCell.isDead());
	}
	
	@Test
	public void testAliveCellHas1AliveNeighbourAndMustDie() {

	}

}
