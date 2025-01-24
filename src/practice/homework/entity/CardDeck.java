package practice.homework.entity;

import java.util.Stack;

public class CardDeck {
    private Stack<Card> cardDeck;

    public Stack<Card> getCardDeck() {
        return cardDeck;
    }

    public CardDeck() {
        cardDeck = new Stack<>();
        init();

    }
           // 초기화에서 셔플 문제, 해결 해야됨
    private void init(){

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Number number : Card.Number.values()) {
                cardDeck.add(new Card(suit, number));
            }
        }
    }

    public Card getCard() {
        return null;
    }
}