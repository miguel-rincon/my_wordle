import java.util.*;

public class Main {

	public static void main(String[] args) {
		String s = "Oso";
		s = s.toUpperCase();
		Word w = new Word(s);
		Board b = new Board(w);
		System.out.println("Longitud de palabra: " + w.getLength());
		b.printBoard();
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine().toUpperCase();
		System.out.println(w.isWord(st));
	}

}
