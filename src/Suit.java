public enum Suit {
    HEARTS("♥"),
    SPADES("♠"),
    DIAMONDS("♦"),
    CLUBS("♣");

    private final String value;

   Suit(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}