package practice.homework.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Card> handCard = new ArrayList<>();
    private String name;
    private int score = 0;
    private Chip chip;

    public User(String name,Chip chip) {
        this.name = name;
        this.chip = chip;
    }

    public List<Card> getHandCards() {
        return handCard;
    }

    public String getName() {
        return name;
    }

    public Chip getChip() {
        return chip;
    }


    public void draw(CardDeck cardDeck) {
        Card card = cardDeck.getCard();
        handCard.add(card);
    }

}
