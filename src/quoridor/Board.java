package quoridor;

import java.io.*;

public class Board implements Display {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    while ((s = in.readLine()) != null && s.length() != 0)
	      display(s);
	}

	public void display(String moves) {
		System.out.println(moves);
	}
}
