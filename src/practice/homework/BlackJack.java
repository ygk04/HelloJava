package practice.homework;

import practice.homework.entity.CardDeck;
import practice.homework.entity.Dealer;
import practice.homework.entity.Rule;
import practice.homework.entity.User;

public class BlackJack {
    public static void main(String[] args) {

        BlackJacktest game = new BlackJacktest(new Rule(), new Dealer(), new User("ygk"), new CardDeck());

        game.start();
        game.play();
    }



}
