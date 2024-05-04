public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    private final String value;

   Suit(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}