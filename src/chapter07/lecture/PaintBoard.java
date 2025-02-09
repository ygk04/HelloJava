package chapter07.lecture;

import java.util.ArrayList;
import java.util.List;

interface Drawable {
    void draw();
}

// 인터페이스를 상속하는 추상 클래스
abstract class Shape  implements Drawable {

    // Drawable 인터페이스의 메서드 구현
    // draw 구현을 강제하지 않고 기본메서드 구현
    // 필요하면 오버라이딩을 하시오. (interface의 defailt 메서드로 대체 가능)
    public void draw() {
        System.out.println("도형을 그립니다.");
    }

    // 추상 메서드 :
    public abstract double calculateArea();

}

class Circle extends Shape {
    // 반지름
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return  Math.PI *radius * radius;
    }

    @Override
    public  void  draw() {
        System.out.print("원");
        super.draw();
    }


}

class Rectangle extends Shape {
    // 가로, 세로 길이
    private double width;
    private double heigth;

    public Rectangle (double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double calculateArea() {
        return width *heigth;
    }


    @Override
    public void draw() {
        System.out.print("사각형");
        super.draw();
    }

}

// 그림판 예제
public class PaintBoard {
    private List<Drawable> drawableList = new ArrayList<>();

    // 도형 추가하는 메서드
   // public void addShape (Drawable){}


     public void drawAllShapes() {
        for(Drawable drawable : drawableList) {
            drawable.draw();
        }
     }

     // 각 도형의 넓이를 계산하여 출력 하는 메서드
    public void printAllAreas() {
        for (Drawable drawable : drawableList) {
            if (drawable instanceof Shape) {
                double area = ((Shape) drawable).calculateArea();

                System.out.println("도형의 넓이: " + area);
            }
        }
    }

}
