public class App {
    public static void main(String[] args) throws Exception {
        var deck = new Deck();

        System.out.println(deck.RemainingCardCount() + " cards in this deck");

        var hand1 = new Hand();
        var hand2 = new Hand();

        while (!deck.IsEmpty()) {
            hand1.addCard(deck.TakeCard());
            hand2.addCard(deck.TakeCard());
        }

        System.out.println(deck.RemainingCardCount() + " cards in this deck");
        System.out.println(hand1.remainingCards() + " cards in first hand");
        System.out.println(hand2.remainingCards() + " cards in second hand");
        int i = 0;
        while (!hand1.isEmpty() && !hand2.isEmpty()) {
            System.out.println("-------------------Competing-------------------");
            compete(hand1, hand2, new Hand());
            System.out.println(hand1.remainingCards() + " cards in first hand");
            System.out.println(hand2.remainingCards() + " cards in second hand");
            System.out.println("-------------------Done-------------------\n\n\n");
            i++;
        }
        System.out.println("Game Over After " + i + " Rounds");
        System.out.println(hand1.remainingCards() + " cards in first hand");
        System.out.println(hand2.remainingCards() + " cards in second hand");

    }

    private static void compete(Hand hand1, Hand hand2, Hand pile) {
        if (hand1.isEmpty() || hand2.isEmpty())
            return;
        Card card1 = hand1.takeCard();
        Card card2 = hand2.takeCard();
        if (card1.getRank().ordinal() > card2.getRank().ordinal()) {
            System.out.println("Hand 1 wins");
            hand1.addCard(card1);
            hand1.addCard(card2);
            while (!pile.isEmpty()) {
                hand1.addCard(pile.takeCard());
            }
        } else if (card1.getRank().ordinal() < card2.getRank().ordinal()) {
            System.out.println("Hand 2 wins");
            hand2.addCard(card1);
            hand2.addCard(card2);
            while (!pile.isEmpty()) {
                hand2.addCard(pile.takeCard());
            }
        } else {
            System.out.println("War");
            pile.addCard(card1);
            pile.addCard(card2);

            try {
                pile.addCard(hand1.takeCard());
                pile.addCard(hand1.takeCard());
                pile.addCard(hand1.takeCard());
            } catch (Exception e) {
                System.err.println("Hand Empty!!!");
                while (!pile.isEmpty()) {
                    hand2.addCard(pile.takeCard());
                }
                return;
            }
            try {
                pile.addCard(hand2.takeCard());
                pile.addCard(hand2.takeCard());
                pile.addCard(hand2.takeCard());
            } catch (Exception e) {
                System.err.println("Hand Empty!!!");
                while (!pile.isEmpty()) {
                    hand1.addCard(pile.takeCard());
                }
                return;
            }
            compete(hand1, hand2, pile);
        }
    }
}
