package lang.enumeration.ref2;

public class EnumRefMain2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액은 " + basic + "원 입니다.");
        System.out.println("GOLD 등급의 할인 금액은 " + gold + "원 입니다.");
        System.out.println("DIAMOND 등급의 할인 금액은 " + diamond + "원 입니다.");
    }
}
