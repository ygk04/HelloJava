package chapter06.lecture;

public class Tickek { // 티켓 클래스 생성 현실의 티켓 모델링//
    private long fee = 1000L;// 인스턴스 필드, 티켓요금

    public String ceatedAt = "2025년 1월 20일 10시 30분";

    public long getFee() {
         return fee;
    }
    public void  setFee(long fee) {
        this.fee = fee;
    }
}
