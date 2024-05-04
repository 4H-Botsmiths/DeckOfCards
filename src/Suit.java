public enum Suit {
    HEARTS("HEARTS"),
    SPADE("SPADE"),
    DIMONDS("DIMONDS"),
    CLUBS("CLUBS");

    private final String value;

   Suit(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}