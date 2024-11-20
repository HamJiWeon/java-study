package lang.enumeration.ex2;

public class DiscountService {
    public int discount(ClassGrade grade, int price) {
        int discountPercent = 0;

        if (grade == ClassGrade.BASIC) discountPercent = 10;
        if (grade == ClassGrade.GOLD) discountPercent = 20;
        if (grade == ClassGrade.DIAMOND) discountPercent = 30;

        return price * discountPercent / 100;
    }
}
