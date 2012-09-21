package quoridor;

import java.io.*;
import java.util.StringTokenizer;

/**
 * A Board is a state of a game of Quoridor. A Board contains 80 Cells.
 */


public class Board implements Display {
	
	/**
     * Initialise this instance. A Board has 2 players
     * 
     * @param cellP1
     *            the current Cell for Player 1
     * @param cellP2
     *            the current Cell for Player 2
     */
	
	static final int BOARD_SIZE = 9;
	Cell cellP1 = new Cell("e9");
	Cell cellP2 = new Cell("e1");
	
	/**
	 * Displays the state of the Board.
	 */
	@Override
	public void display(String moves) {
		getMoves(moves);
		System.out.println(moves);
	}

	/**
	 * Gets the string of moves and arranges them.
	 */
	private void getMoves(String moves) {
		StringTokenizer st = new StringTokenizer(moves);
		
	}
}
