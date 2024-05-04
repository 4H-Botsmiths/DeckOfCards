public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIMONDS("Dimonds"),
    CLUBS("Clubs");

    private final String value;

   Suit(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}