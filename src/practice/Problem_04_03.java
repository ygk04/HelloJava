package practice;


// 두 주사위 누의 합이 5이면 실행을 멈춤
public class Problem_04_03 {
    public static void main(String[] args) {
       int dice1, dice2;


        while (true) {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;

            System.out.println("( dice1 + " + " dice2 +)");

            if (dice1 + dice2 == 5)
                break;

        }
    }
}
