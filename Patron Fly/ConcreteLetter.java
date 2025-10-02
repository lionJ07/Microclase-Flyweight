class ConcreteLetter implements Letter {
    private final char value; // intrínseco
    ConcreteLetter(char v) { this.value = v; }
    @Override
    public void print(int position) {
        System.out.println("Letra " + value + " en posición " + position);
    }
}