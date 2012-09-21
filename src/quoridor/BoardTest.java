package quoridor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	
	Display board = new Board();

	@Before
	public void setUp() throws Exception {

	}
	
	@Test
    public void testDisplay()
    {
		String s = "1.e2 e8";
        board.display(s);
    }
    

}
