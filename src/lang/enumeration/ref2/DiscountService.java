package lang.enumeration.ref2;

import static lang.enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if (grade == Grade.BASIC) discountPercent = 10;
        if (grade == Grade.GOLD) discountPercent = 20;
        if (grade == Grade.DIAMOND) discountPercent = 30;

        return price * discountPercent / 100;
    }
}
