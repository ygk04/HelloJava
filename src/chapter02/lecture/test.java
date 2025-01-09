package chapter02.lecture;

public class test {
    public static void main(String[] args){
        for (int i = 2; i <= 9; i += 2) {
            System.out.println("*** " + i + "단 ***");


            for (int n = 2; n <= 9; n++) {
                System.out.println(i + " x  " + n + " = " + i * n);


            }

        }

    }
}
