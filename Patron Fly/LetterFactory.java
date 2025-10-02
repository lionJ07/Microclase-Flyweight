import java.util.Map;
import java.util.HashMap;

public class LetterFactory {
    private static final Map<Character, Letter> letters = new HashMap<>();

    public static Letter getLetter(char c) {
        Letter l = letters.get(c);
        if (l == null) {
            l = new ConcreteLetter(c);
            letters.put(c, l);
        }
        return l;
    }

    public static int getNumberOfLettersCreated() {
        return letters.size();
    }
}