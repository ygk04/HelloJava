package practice;

class Coffee {

    public String type;
    public String size;
    public String topping;
    public int price;

    public Coffee() {

    }

    public Coffee(String type, String size, String topping, int price) {
        this.type = type;
        this.size = size;
        this.topping = topping;
        this.price = price;
    }
}


public class CoffeeTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        Coffee Americano = new Coffee("아메리카노","M", "샷 추가", 1500 );
        Coffee Cafelatte = new Coffee("카페라떼","G","휘핑", 3000 );
        Coffee Cafemocha = new Coffee("카페모카","M", "없음", 2500 );
        Coffee Chocolate_Chip_Frappuccino = new Coffee("초코칩 프라푸치노","M", "초코칩, 휘핑추가", 5500 );

        System.out.println(Americano.type + " / " + Americano.size + " / " + Americano.topping + " / " + Americano.price);
        System.out.println(Cafelatte.type + " / " + Cafelatte.size + " / " + Cafelatte.topping + " / " + Cafelatte.price);
        System.out.println(Cafemocha.type + " / " + Cafemocha.size + " / " + Cafemocha.topping + " / " + Cafemocha.price);
        System.out.println(Chocolate_Chip_Frappuccino.type + " / " + Chocolate_Chip_Frappuccino.size + " / " + Chocolate_Chip_Frappuccino.topping + " / " + Chocolate_Chip_Frappuccino.price);

    }
}
