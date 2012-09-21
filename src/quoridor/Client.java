package quoridor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		Display board = new Board();
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    while ((s = stdin.readLine()) != null && s.length() != 0) {
	    	board.display(s);
	    }
	    //TODO: Split input to moves.
	    //String first = s.split(" ")[0].toString();
	    //String second = s.split(" ")[1];
	    //System.out.println(first);
	}

}
