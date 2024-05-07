public class App {
    public static void main(String[] args) throws Exception {
        var deck = new Deck();

        System.out.println(deck.RemainingCardCount() + " cards in this deck");

        while(!deck.IsEmpty())
            System.out.println(deck.TakeCard() + "; " + deck.RemainingCardCount() + " cards remaining");
    }
}
