public class App {
    public static void main(String[] args) throws Exception {
        var deck = new Deck();

        System.out.println(deck.RemainingCardCount() + " cards in this deck");

        var hand1 = new Hand();
        var hand2 = new Hand();

        while(!deck.IsEmpty()) {
            hand1.AddCard(deck.TakeCard());
            hand2.AddCard(deck.TakeCard());
        }

        System.out.println(deck.RemainingCardCount() + " cards in this deck");
        System.out.println(hand1.RemainingCardCount() + " cards in first hand");
        System.out.println(hand2.RemainingCardCount() + " cards in second hand");
        
        var round = 1;
        var escrowHand = new Hand();
        var tieBreakerCardCount = 999999;
        while (hand1.RemainingCardCount() > tieBreakerCardCount + 1 && hand2.RemainingCardCount() > tieBreakerCardCount + 1) {
            System.out.println("round: " + round++);
            System.out.println("hand 1 cards remaining: " + hand1.RemainingCardCount());
            System.out.println("hand 2 cards remaining: " + hand2.RemainingCardCount());

            var card1 = hand1.RemoveCard();
            var card1Value = card1.getRank().ordinal();
            System.out.println("card 1: " + card1);

            var card2 = hand2.RemoveCard();
            var card2Value = card2.getRank().ordinal();
            System.out.println("card 2: " + card2);

            if (card1Value > card2Value) {
                System.out.println("hand 1 won!");
                escrowHand.AddCard(card1);
                escrowHand.AddCard(card2);
                while(!escrowHand.IsEmpty())
                    hand1.AddCardToBottom(escrowHand.RemoveCard());
                continue;
            } else if (card1Value < card2Value) {
                System.out.println("hand 2 won!");
                escrowHand.AddCard(card1);
                escrowHand.AddCard(card2);
                while(!escrowHand.IsEmpty())
                    hand2.AddCardToBottom(escrowHand.RemoveCard());
                continue;
            } else if (card1Value == card2Value) {
                System.out.println("its a tie!");
                escrowHand.AddCardToBottom(card1);
                escrowHand.AddCardToBottom(card2);

                for (int i = 0; i < tieBreakerCardCount; i++) {
                    escrowHand.AddCard(hand1.RemoveCard());
                    escrowHand.AddCard(hand2.RemoveCard());
                }
                continue;
            }
        }
        if(hand1.RemainingCardCount() > hand2.RemainingCardCount())
        {
            System.out.println("hand 1 won the game!");
        }
        if(hand1.RemainingCardCount() < hand2.RemainingCardCount())
        {
            System.out.println("hand 2 won the game!");
        }
    }
}