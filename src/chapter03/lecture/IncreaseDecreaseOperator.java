package chapter03.lecture;

public class IncreaseDecreaseOperator {
    public static void main(String []args) {
        int x = 10;
        int y = 10;
        int z;
        int g;
        int h;

        System.out.println("----------------");
        x++; //++ 연산 x = x + 1;
        ++x; // x = 12
        System.out.println("x = " + x);

        System.out.println("----------------");
        y--; // -- 연산 x = x - 1;
        --y; // y = 8
        System.out.println("y = " + y);

        System.out.println("----------------");
        z = x++;
        // z = x; // 12
        // x = x + 1; // 13
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("----------------");
        z = ++x;
        // x = x + 1; // 14
        // z = x; // 14
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("----------------");
        z = ++x + y++; // x = 14, y = 8
        System.out.println("z = " + z); // z = ? 23
        System.out.println("x = " + x); // x = ? 15
        System.out.println("y = " + y); // y = ? 9

        System.out.println("----------------");
        g = ++x + y++ + ++x ;
        System.out.println("g = " + g); // 42
        System.out.println("x = " + x); // 17
        System.out.println("y = " + y); // 10

        System.out.println("----------------");
        h = ++x + y++ + ++x + y++;
        System.out.println("h = " + h); // 42
        System.out.println("x = " + x); // 17
        System.out.println("y = " + y); // 10



    }
}
