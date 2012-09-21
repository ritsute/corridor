package quoridor;

/**
 * A Cell is a sub-section of a Board. A Board contains 80 Cells in the game of 
 * Quoridor. 
 */

public class Cell {
	
	private int col;
	private int row;
	
	public Cell() {
		
	}
	
	/**
     * A Cell can be initialised with 2 integers.
     * 
     * @param row
     *            The row number of the Cell
     * @param col
     *            The column number of the Cell
     */
	public Cell(int row, int col) {
		this.col = col;
		this.row = row;
	}
	
	/**
     * A Cell can be initialised with a String. 
     * 
     * @param c
     *            The String will be converted to the position of the Cell.
     */
	public Cell(String c) {
		if (c.length() > 1) {
			this.col = c.charAt(0) - 'a';
			this.row = c.charAt(1) - '1';

		}
	}
	
	/**
     * Returns the Column number of the particular Cell.
     */
	public int getCol() {
		return col;
	}
	
	/**
     * Returns the Row number of the particular Cell.
     */
	public int getRow() {
		return row;
	}
	
	/**
     * Overrides the original toString method.
     */
	@Override
	public String toString() {
		char col = 'a';
    	char row = '1';
    	col += this.col;
    	row += this.row;
    	return "[" + col + row +  "]";
	}

	/**
     * Overrides the original equals method. Compares 2 Cells to determine if they
     * are equal. Returns true if the 2 Cells are in the same position. Returns
     * false if the 2 Cells are of different positions.
     * 
     * @param obj
     *            The Object obj will be compared with the current cell.      
     */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cell) {
			Cell c = (Cell)obj;
			return (c.col == col && c.row == row);
		}
		return false;
	}
	
	/**
     * Overrides the original hashCode method. Labels the Cells from left to right,
     * top to bottom by using the formula;(9 * col) + row.
     */
	@Override
	public int hashCode() {
		return (9 * col) + row;
	}

}
