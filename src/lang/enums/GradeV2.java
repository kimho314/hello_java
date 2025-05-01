package lang.enums;

public enum GradeV2 {
    BASIC(10),
    GOLD(20),
    DIAMOND(30),
    VIP(40);

    private final int discountPercent;

    GradeV2(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
