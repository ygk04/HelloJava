package practice.homework.entity;

import java.util.List;

public class Rule {
    private int VICTORY_DEALER = 0;
    private int VICTORY_USER = 0;

    private final int BLACKJACK_SCORE = 21;

    public int getVICTORY_DEALER() {
        return VICTORY_DEALER;
    }

    public int getVICTORY_USER() {
        return VICTORY_USER;
    }

    public int getBLACKJACK_SCORE() {
        return BLACKJACK_SCORE;
    }

    public int Score(List<Card> cards){
        int i = 0;
        int aceNumber = 0;

        for (Card card : cards) {
            int value = card.getNumber().getValues()[0];
            if (value == 1) {
                value = 11;
                aceNumber++;
            }
            i += value;
        }

        while (i > 21 && aceNumber > 0) {
            i -= 10;
            aceNumber--;
        }

        return i;
    }

    public String getWinner(Dealer dealer, User user) {
        int dealerScore = Score(dealer.getHandCard());
        int userScore = Score(user.getHandCards());

        String winner;

        if (userScore == BLACKJACK_SCORE) {
            winner = user.getName();
            VICTORY_USER++;
        } else if (BLACKJACK_SCORE < dealerScore && userScore < BLACKJACK_SCORE) {
            winner = user.getName();
            VICTORY_USER++;
        } else if (userScore < BLACKJACK_SCORE && dealerScore < userScore) {
            winner = user.getName();
            VICTORY_USER++;
        } else if (userScore < BLACKJACK_SCORE && (userScore == dealerScore)){
            winner = "draw";
        } else {
            winner = dealer.getName();
            VICTORY_DEALER++;
        }

        return winner;
    }
}

