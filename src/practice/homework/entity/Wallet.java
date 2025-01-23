package practice.homework.entity;

public class Wallet {
    private Long chip;

    public void minusChip(Long chip) {
        this.chip -= chip;
    }

    public void plusChip(Long chip) {
        this.chip += chip;
    }

}
