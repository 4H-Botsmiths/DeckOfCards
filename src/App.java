public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        var deck = new Deck();
        deck.Shuffle();

        while(!deck.IsEmpty())
            System.out.println(deck.TakeCard() + "; " + deck.RemainingCardCount() + " cards remaining");
    }
}
