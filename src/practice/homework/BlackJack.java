package practice.homework;

import practice.homework.entity.*;

public class BlackJack {
    public static void main(String[] args) {

        BlackJacktest game = new BlackJacktest(new Rule(), new Dealer(), new User("ygk", new Chip()), new CardDeck());
        game.start();
    }



}
