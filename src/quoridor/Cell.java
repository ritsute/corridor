package quoridor;

/**
 * A Cell is a sub-section of a Board. A Board contains 80 Cells in the game of 
 * Quoridor. 
 */

public class Cell {
	
	/**
     * Initialise this instance. A cell contains 2 parameters. The parameters start
     * from 0.
     * 
     * @param row
     *            the row number of the cell
     * @param col
     *            the column number of the cell
     */
	
	private int row;
	private int col;
	
	public Cell() {
		
	}
	
	/**
     * A cell can be initialised with 2 integers, first being the row number
     * and second will be the column number.
     */
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	/**
     * A cell can be initialised with a String. The String will be converted with
     * the first character being the row, and the second character being the column.
     */
	public Cell(String c) {
		if (c.length() > 1) {
			this.row = c.charAt(1) - '1';
			this.col = c.charAt(0) - 'a';
		}
	}
	
	/**
     * Returns the Row number of the particular Cell.
     */
	public int getRow() {
		return row;
	}
	
	/**
     * Returns the Column number of the particular Cell.
     */
	public int getCol() {
		return col;
	}
	
	/**
     * Overrides the original toString method. 
     */
	@Override
	public String toString() {
    	char row = '1';
    	char col = 'a';
    	row += this.row;
    	col += this.col;
    	return "[" + col + row +  "]";
	}

	/**
     * Overrides the original equals method. Comapres 2 Cells to determine if they
     * are equal.
     */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cell) {
			Cell c = (Cell)obj;
			return (c.row == row && c.col == col);
		}
		return false;
	}
	
	/**
     * Overrides the original hashCode method. Labels the cells from left to right,
     * top to bottom by using the formula; row + (9 * col).
     */
	@Override
	public int hashCode() {
		return row + (9 * col);
	}

}
