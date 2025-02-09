package practice.homework.entity;

public class Card {

    private Suit suit;
    private Number number;

    @Override
    public String toString() {
        return suit + " , " + number + "  " +
                "카드 숫자 " + number.getValues()[0] + " 입니다";
    }

    public Card(Suit suit, Number number) {
        this.suit = suit;
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }

    enum Number {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
        SEVEN(7), EIGHT(8), NINE(9), TEN(10),
        JACK(10), QUEEN(10), KING(10), ACE(1, 11);

        public final int[] values;

        Number(int ... value) {
            this.values = value;
        }

        public int[] getValues() {
            return values;
        }
    }

    enum Suit { SPADE, DIAMOND, HEART, CLUB }

    public Number getnumber() {
        return number;
    }

    public Card getCard() {
        this.getCard();

        return null;
    }

}




