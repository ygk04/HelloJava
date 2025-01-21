package practice.homework.entity;

public class Seat {
    private long id; //좌석 번호

    private String desciption;

    public Seat(long id) {
        this.id = id;
        this.desciption = id + "번 플레이어";
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", desciption='" + desciption + '\'' +
                '}';
    }

}
