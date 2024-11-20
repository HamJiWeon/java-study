  package lang.enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액은 " + vip + "원 입니다.");

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액은 " + diamondd + "원 입니다.");

        // 소문자 입력
        int DIAMOND = discountService.discount("diamond", price);
        System.out.println("diamond 등급의 할인 금액은 " + DIAMOND + "원 입니다.");
    }
}
