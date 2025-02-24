package chapter09.lecture;

import java.util.Comparator;

interface Eatable {}

class Fruit implements Eatable {
    String name;

    int weight;

    public Fruit() {
    }

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit implements Comparable<Apple> {
    public Apple() {
    }

    public Apple(String name, int weight) {
        super(name, weight);
    }

    public String toString() {
        return "Apple" + weight + "g";
    }

    // 오름차순
    @Override
    public int compareTo(Apple o) {
        return this.weight - o.weight;
    }
}

class Grape extends Fruit implements Comparable<Grape> {
    public Grape() {
    }

    public Grape(String name, int weight) {
        super(name, weight);
    }

    public String toString() {
        return "Grape" + weight + "g";
    }

    // 오름차순
    @Override
    public int compareTo(Grape o) {
        return this.weight - o.weight;
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

// 과일 무게 기준으로 내림차순으로 정렬하기
class FruitCompDesc implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o2.weight - o1.weight;
    }
}

// 과일 무게 기준으로 오름차순으로 정렬하기
class FruitCompAsc implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.weight - o2.weight;
    }
}