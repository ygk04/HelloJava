package chapter06;

public class Account {
    public static int counter = 0; //식별번호 몇번 까지
    private int id;                 // 식별 번호
    private String name;            // 계좌 명의
    private String no;               // 계좌 번호
    private long balance;           // 예금 잔고
    private Day openDay;            // 계좌 개설일

    // 인스턴스 초기화 번호
    {
        id = ++counter;
        System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
    }

    // 생성자
    public Account(String name, String no) { // 예금액이 0이고 계좌 개설일은 오늘
        this(name, no, 0, new Day());
    }

    public Account( String name, String no, long balance,Day openDay) {
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.openDay = new Day (openDay);
    }
    // getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public long getBalance() {
        return balance;
    }

    public Day getOpenDay() {
        return new Day (openDay);
    }

    public void withdraw(long k) {
        balance -= k;
    }
    @Override
    public String toString() {
        return "{" + name + ", " + no + ", " + balance + "}";
    }

}
