package chapter07;

abstract class Tire {
    String brand;

    Tire(String brand) {
        this.brand = brand;
    }

    void roll() {
        System.out.println(brand + "타이어가 굴러갑니다.");
    }

    abstract void broke();
}
class KumhoTire extends Tire {
    KumhoTire() {
        super ("금호");
    }

    @Override
     void roll() {
        System.out.println(brand + "타이어가 경쾌하게 굴러갑니다.");
    }

    @Override
    void broke() {
        System.out.println(brand + "타이어가 고장났지만 30분더 주행 가능합니다.");
    }

}

class HankookTire extends Tire {
    HankookTire() {
        super ("한국");
    }

    @Override
    void roll() {
        System.out.println(brand + "타이어가 부드럽게 굴러갑니다.");
    }

    @Override
    void broke() {
        System.out.println(brand + "타이어가 고장나서 바로 교체가 필요합니다.");
    }

}

abstract class Engine {
    String type;

    Engine(String type){
        this.type = type;
    }

    void sound() {
        System.out.println(type + "엔진 소리가 울립니다.");
    }
}

class V6Engine extends Engine{
    V6Engine() {super("6기통");}

    @Override
    void sound() {
        System.out.println(type + "엔진 소리가 잔잔합니다");
    }
}

class V8Engine extends Engine{
    V8Engine() {super("8기통");}

    @Override
    void sound() {
        System.out.println(type + "엔진 소리가 웅장합니다");
    }

}

class V10Engine extends Engine{
    V10Engine() {super("10기통");}
    @Override
    void sound() {
        System.out.println(type + "엔진 소리가 괴물같습니다");
    }
}


class MyCar {
    Tire frontLeftTire;
    Tire frontRightTire;
    Tire rearLeftTire;
    Tire rearRightTire;
    Engine engine;

    public MyCar(Tire frontLeftTire, Tire frontRightTire, Tire rearLeftTire, Tire rearRightTire, Engine engine) {
        this.frontLeftTire = frontLeftTire;
        this.frontRightTire = frontRightTire;
        this.rearLeftTire = rearLeftTire;
        this.rearRightTire = rearRightTire;
        this.engine = engine;
    }

    void drive(){
        System.out.println("자동차가 주행중입니다.");
        engine.sound();
        frontLeftTire.roll();
        frontRightTire.roll();
        rearLeftTire.roll();
        rearRightTire.roll();

        System.out.println("주행 중에 앞왼쪽 바퀴가 고장이 났습니다.");
        frontLeftTire.broke();
        System.out.println("주행 중에 뒷왼쪽 바퀴가 고장이 났습니다.");
        rearLeftTire.broke();

    }

}

public class MyCarExample {
    public static void main(String[] args) {
        // 추상 클래스는 객채 생성 불가
        //Tire tire = new Tire("금호");

        KumhoTire frontLeft = new KumhoTire();
        KumhoTire frontRight = new KumhoTire();

        HankookTire rearLeft = new HankookTire();
        HankookTire rearRight = new HankookTire();

        V8Engine engine = new V8Engine();

        MyCar myCar = new MyCar(frontLeft, frontRight, rearLeft, rearRight, engine);

        myCar.drive();

    }
}
