public class Main {
    public static void main(String[] args) {
        WordPrinter wp = new WordPrinter("banana");
        wp.printWithPositions();

        System.out.println("Cantidad de objetos Letter creados: " + 
            LetterFactory.getNumberOfLettersCreated());
    }
}
