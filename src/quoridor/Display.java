package quoridor;
/**
 * An interface for Display
 */
public interface Display {
	
	/**
	 * A Board is a state of a game of Quoridor. A Board contains 80 Cells.
	 */
	void display(String moves);
	boolean hasPlayer(int i, int j);
	char player(int i, int j);

}
