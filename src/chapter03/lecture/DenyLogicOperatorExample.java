package chapter03.lecture;

public class DenyLogicOperatorExample {
    public static void main(String []args) {
        boolean play = true;
        System.out.println("plat = " + play);

        play = !play; // true -> false
        System.out.println("plat = " + play);

        play = !play; // false -> true
        System.out.println("plat = " + play);
    }
}
