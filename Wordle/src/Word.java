
public class Word {
	String word;
	char[] hdnWord;
	//constructor
	Word(String w){
		word = w;
		hdnWord = w.toCharArray();
	}
	int getLength() {
		int l = (word.length()!=0)?word.length():0;
		return l;
	}
	boolean isWord(String w){
		char[] arrayStr = w.toCharArray();
		for (int i = 0; i < arrayStr.length; i++) {
			if(arrayStr[i] != hdnWord[i]) {
				return false;
			}
		}
		return true;
	}
}
