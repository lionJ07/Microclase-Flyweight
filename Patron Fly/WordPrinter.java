public class WordPrinter {
    private final String word;
    public WordPrinter(String word){
        this.word = word;
    }
    public void printWithPositions() {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            Letter letter = LetterFactory.getLetter(c);
            letter.print(i);
        }
    }
}
