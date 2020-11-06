package CardsWithPower;

public class Powers {
    private Card card;
    private Suit suit;
    private int power;

    public Powers(Card card, Suit suit){
        this.card = card;
        this.suit = suit;
        this.power = card.getPower() + suit.getPower();
    }
//    public int getPower() {
//        return this.power;
//    }
    @Override
    public String toString() {
        return String.format("Card name: %s of %s; " + "Card power: %d%n",
                this.card, this.suit, this.power);
    }
}
