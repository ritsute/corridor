package quoridor.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import quoridor.Cell;

public class CellTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetRow() {
		Cell c1 = new Cell("e1");
		assertEquals(0, c1.getRow());
	}
	
	@Test
	public void testGetCol() {
		Cell c1 = new Cell("e9");
		assertEquals(4, c1.getCol());
	}
	
	@Test
	public void testEquals() {
		Cell c1 = new Cell("e5");
		Cell c2 = new Cell("e5");
		assertEquals(true, c1.equals(c2));
		Cell c3 = new Cell("e5");
		Cell c4 = new Cell("e4");
		assertEquals(false, c3.equals(c4));
	}
	
	@Test
	public void testHashCode() {
		Cell c1 = new Cell("a1");
		System.out.println(c1.hashCode());
		assertEquals(0, c1.hashCode());
		
		Cell c2 = new Cell("e1");
		System.out.println(c2.hashCode());
		assertEquals(36, c2.hashCode());
		
		Cell c3 = new Cell("e9");
		System.out.println(c3.hashCode());
		assertEquals(44, c3.hashCode());
		
		Cell c4 = new Cell("i9");
		System.out.println(c4.hashCode());
		assertEquals(80, c4.hashCode());
	}

}
