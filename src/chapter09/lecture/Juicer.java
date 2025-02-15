package chapter09.lecture;

// 매개변수에 과일박스를 대입하면 주스를 만들어서 반환하는 상황이 발생했다고 가정
// Juicer라는 클래를 만들어서 과일을 주스로 만들어서 반환하는 makeJuice() static 메서드를 정의
// 지네릭 클래스의 타입변수는 인스턴스 변수로 간주되기 때문에 static 메서드에 활용할 수 없음
// 아예 지네릭스를 적용하지 않던가, 타입 매개변수 대신 특정 타입을 지정해주어야 함
public class Juicer {

    // 결론 : 와일드 카드를 사용
    // <?> : 제한 없음. 모든 타입이 가능. <T extends Object>와 동리
    // <? extends T> : 와일드 카드의 상한 제한, T와 그 자손들만 가능
    // <? super T> : 와일드 카드의 하한 제한, T와 그 조상들만 가능
    static String makeJuice(FruitBox<? super Apple> box) {
        String tmp = "";

        for(Object fruit : box.getList()) {
            // Fruit f = (Fruit) fruit;
            tmp += fruit + " ";
        }

        return tmp + "Juice";
    }


    // 방법 1 : 지네릭스 적용하지 않기
    static String makeJuice1(FruitBox box) {
        String tmp = "";

        for(Object fruit : box.getList()) {
            Fruit f = (Fruit) fruit;
            tmp += fruit + " ";
        }

        return tmp + "Juice";
    }

    // 방법 2 : 타입 매개변수 대신 특정 타입을 지정해주어야 함
    // FruitBox<Fruit> 전체 문장이 하나의 타입으로 간주됨
    static String makeJuice2(FruitBox<Fruit> box) {
        String tmp = "";

        for(Object fruit : box.getList()) {
            tmp += fruit + " ";
        }

        return tmp + "Juice";
    }

    // startregion 방법 2-2 : 새로운 파라미터 FruitBox<Fruit> 선언
    // 컴파일 에러 발생 이유 : 메소드 오버로딩 발생
    // 지네릭 타입은 컴파일러가 컴파일할 때만 사용하고 제거해버림
    // 컴파일 후에 FruitBox<Fruit>, FruitBox<Apple> => FruitBox 타입으로 간주됨
    // 따라서 두 메서드는 오버로딩이 아니라 메서드 중복 정의
//    static String makeJuice2(FruitBox<Apple> box) {
//        String tmp = "";
//
//        for(Object fruit : box.getList()) {
//            tmp += fruit + " ";
//        }
//
//        return tmp + "Juice";
//    }
    //endregion
}
