package quoridor.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import quoridor.Board;
import quoridor.Display;

public class BoardTest {
	
	Display board = new Board();

	@Before
	public void setUp() throws Exception {

	}
	
	@Test
    public void testDisplay()
    {
		String s = "1.e2 e8 2.e3 e7";
        board.display(s);
    }
    

}
