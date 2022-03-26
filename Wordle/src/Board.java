
public class Board {
	Word w;
	//Constructor
	Board(Word wd) {
		w = wd;
	}
	void printBoard(){
		int wordSize = w.getLength();
		wordSize = wordSize*2;
		char[] board = new char[wordSize];
		for(int i=0; i<wordSize; i++) {
			board[i] = (i%2==0) ? '[' : ']' ;
		}
		for(int i=0; i<4; i++) {
			for(char ch: board) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	void hiddenWord() {
		
	}
}
