package quoridor.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import quoridor.Board;
import quoridor.Display;

public class BoardTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
    public void testDisplay() {
		Display board = new Board();
		String s = "1.e2 e8 2.e3 e7";
        board.display(s);
    }
	
	@Test
	public void testHasPlayer() {
		Display board = new Board("a","1");
		assertEquals(true,board.hasPlayer(1,1));
		assertEquals(false,board.hasPlayer(6, 1));
	}

}
