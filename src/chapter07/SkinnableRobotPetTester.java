package chapter07;

import java.util.ArrayList;
import java.util.List;

public class SkinnableRobotPetTester {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();


        pets.add(new Pet("Kurt", "아이"));
        pets.add(new RobotPet("R2D2", "루크 스카이워커"));
        pets.add(new SkinnableRobotPet("OS X5","Apple", Skinnable.YELLOW));
        pets.add(new Pet("흰둥이", "짱구"));

        for (Pet p : pets) {
            //자기소개
            p.introduce();

            // 만약 SkinnableRobotPet 이라면
            // 스킨 색을 출력하는 메소드 호출
            if (p instanceof SkinnableRobotPet) {
                System.out.println("스킨은");
                ((SkinnableRobotPet)p).printSkin();
                System.out.println("입니다");
            }
            System.out.println();
        }

    }
}
