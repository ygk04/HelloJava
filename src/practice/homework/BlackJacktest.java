package practice.homework;

import practice.homework.entity.*;

import java.util.Scanner;

public class BlackJacktest {
    private Rule rule;
    private Dealer dealer;
    private User user;
    private CardDeck cardDeck;


    public BlackJacktest(Rule rule, Dealer dealer, User user, CardDeck cardDeck) {
        this.rule = rule;
        this.dealer = dealer;
        this.user = user;
        this.cardDeck = cardDeck;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("0")) {
            play();
            System.out.print("게임을 계속하시겠습니까? (계속하려면 아무 키나 누르세요, 종료하려면 'exit' 입력): ");
            input = scanner.nextLine();
            reset();
        }
        System.out.println("게임을 종료합니다.");
    }

    private void reset() {

        this.cardDeck = new CardDeck();
        dealer.getHandCard().clear();
        user.getHandCards().clear();
    }

    public void play( ) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" 블랙잭을 시작하겠습니다.");
        System.out.println("베팅 해주세요");
        System.out.println("베팅:");
        int chip = sc.nextInt();
        initialDeal();
        dealerTurn();
        userTurn();

        gameFinish(dealer, user);

    }

    private void initialDeal() {

        dealer.draw(cardDeck);
        dealer.draw(cardDeck);
        user.draw(cardDeck);
        user.draw(cardDeck);
    }


    private void dealerTurn() {

        while (rule.Score(dealer.getHandCard()) < 17) {
            dealer.draw(cardDeck);
        }
        System.out.println("딜러의 카드 한장은 : " + dealer.getHandCard().get(0));
    }

    private void userTurn() {
        Scanner scanner = new Scanner(System.in);
        boolean continueDrawing = true;

        while (continueDrawing && rule.Score(user.getHandCards()) <= rule.getBLACKJACK_SCORE()) {
            System.out.println("현재 나의 숫자는 : " + rule.Score(user.getHandCards())
                    +" 이고 카드는 " + user.getHandCards().size() + "장 입니다");
            System.out.print("카드를 더 받으시겠습니까? (H/S): "); //Hit, Stay
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("H")) {
                user.draw(cardDeck);
            } else {
                continueDrawing = false;
            }
        }
    }

    private void gameFinish(Dealer dealer, User user){
        String winner = rule.getWinner(dealer, user);

        System.out.println( dealer.getName() + "의 카드는 " + rule.Score(dealer.getHandCard()) +
                "이고 " + user.getName() + "의 카드는 " + rule.Score(user.getHandCards())+" 입니다.");
        System.out.println("따라서 승리자는 " + winner);
        System.out.println("현재 나의 전적 : " + rule.getVICTORY_USER() + "승 ," +
                " " + rule.getVICTORY_DEALER() + "패");
    }
}