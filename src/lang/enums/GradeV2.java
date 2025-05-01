package lang.enums;

public enum GradeV2 {
    BASIC(10),
    GOLD(20),
    DIAMOND(30);

    private final int discountPercent;

    GradeV2(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
