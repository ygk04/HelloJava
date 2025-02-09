package practice.homework.entity;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

    private List<Card> handCard = new ArrayList<>();
    private String name = "딜러";
    private int score = 0;


    public String getName() {
        return name;
    }

    public List<Card> getHandCard() {
        return handCard;
    }

    public void draw(CardDeck cardDeck) {
        Card card = cardDeck.getCard();
        handCard.add(card);
    }


}
