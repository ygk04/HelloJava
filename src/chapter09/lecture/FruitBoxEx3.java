package chapter09.lecture;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        // 제한된 지네릭 클래스의 제한을 풀고 바로 아래 코드 실행 가능
        // FruitBox<Toy> toyBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        // toyBox.add(new Toy());

        // 방법 1 호출 예 :
        System.out.println(Juicer.makeJuice1(fruitBox));
        System.out.println(Juicer.makeJuice1(appleBox));
        // 제한된 지네릭 클래스를 활용함으로써 static method에서도 타입을 제한하는 방법이 필요함
        // System.out.println(Juicer.makeJuice1(toyBox)); // ClassCastException : Fruit을 상속받지 않음

        // 방법 2 호출 예 :
        System.out.println(Juicer.makeJuice2(fruitBox));
        // FruitBox<Fruit> 타입이 아닌 FruitBox<Apple>은 파라미터로 넘겨줄 수 없음
        // System.out.println(Juicer.makeJuice2(appleBox));

        // 방법 3 : 결론
        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
        // 하한 제한을 걸었을 경우 그 조상인 Object도 가능함
        // System.out.println(Juicer.makeJuice(new FruitBox()));
    }
}
