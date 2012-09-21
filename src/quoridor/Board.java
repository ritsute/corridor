package quoridor;

import java.util.StringTokenizer;

/**
 * A Board is a state of a game of Quoridor. A Board contains 80 Cells.
 */
public class Board implements Display {
	
	static final int SIZE = 9;
	Cell cellP1; 
	Cell cellP2;
	
	public Board (){
		this.cellP1 = new Cell("e1");
		this.cellP2 = new Cell("e9");
	}
	
	public Board (String a, String b){
		this.cellP1 = new Cell(a);
		this.cellP2 = new Cell(b);
	}
	
	/**
	 * Displays the state of the Board.
	 */
	@Override
	public void display(String moves) {
		getMoves(moves);
		System.out.println(moves);
		System.out.print("   ");
		for (char c = 'a'; c < 'j' ; c++) {
			System.out.print(c+"   ");
		}
		System.out.println ();
		for (int i = 0; i < 2 * SIZE + 1; i++) {
			for (int j = 0; j < 2 * SIZE + 1; j++) {
				if (j == 0) {		
					if (i % 2 == 0) {
						System.out.print(" ");
					} else {
						System.out.print((i>>1)+1);
					}
				}
				printBoard(i, j);
			}
		}
	}

	/**
	 * Gets the string of moves and arranges them.
	 */
	private void getMoves(String moves) {
		StringTokenizer st = new StringTokenizer(moves);
		
	}
	
	private void printBoard (int i, int j) {
		if ( (i + j) % 2 == 0) {
			if (j % 2 == 0) {
				System.out.print("+");
			} else {
				if (hasPlayer(i, j)) {
					System.out.print(" "+player(i, j)+" ");
				} else {
					System.out.print("   ");
				}
			}
		} else {
			if (i % 2 == 0) {
					System.out.print("---");
			} else {
					System.out.print("|");		
			}

		}
		if (j == 2 * SIZE) 
			System.out.println();
	}

	public boolean hasPlayer(int i, int j) {
		Cell transformedPosition = new Cell((i-1)>>1,(j-1)>>1);
		return cellP1.equals(transformedPosition) || cellP2.equals(transformedPosition);
		
	}
	
	public char player(int i, int j) {
		Cell transformedPosition = new Cell((i-1)>>1, (j-1)>>1);
		return cellP1.equals(transformedPosition) ? 'B' : 'W';
	}
}
