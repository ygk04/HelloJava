package chapter06;

public class Human {

    private String name; // 이름
    private int height; // 신장
    private int weight; // 체중

    // 생성자
    public Human( String name,  int height,  int weight ) {
        this.name = name;
        this.height =height;
        this.weight = weight;
    }

    // getter
    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    public  int getWeight() {
        return weight;
    }
    // 메서드
    void gainWeight(int w) {
        this.weight += weight;
    }

    void reduceWeight(int w) {
        this.weight -= weight;
    }

}
