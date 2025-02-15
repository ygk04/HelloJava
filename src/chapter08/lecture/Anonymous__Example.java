package chapter08.lecture;

interface Calculatable {
    public int sum();
}

class Anonymous__ {
    private int field;

    public void method(final int arg1, int arg2) {
        final int var1 = 0;
        int var2 = 0;

        field = 10;

        // arg1 = 20;
        // arg2 = 20;

        // var1 = 30;
        // var2 = 30;

        Calculatable calc = new Calculatable() {
            // 익명 객체의 로컬 변수 사용에는 로컬 변수가 복사되기 때문에
            // 해당 변수를 final로 간주하고 사용해야 함(자바 7이하에서는 final 강제)
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;
                return result;
            }
        };

        System.out.println(calc.sum());
    }
}

// 익명 객체의 로컬 변수 사용
public class Anonymous__Example {
    public static void main(String[] args) {
        Anonymous__ anony = new Anonymous__();
        anony.method(0, 0);
    }
}
