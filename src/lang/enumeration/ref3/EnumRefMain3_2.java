package lang.enumeration.ref3;

public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

        System.out.println("BASIC 등급의 할인 금액은 " + Grade.BASIC.discount(price) + "원 입니다.");
        System.out.println("GOLD 등급의 할인 금액은 " + Grade.GOLD.discount(price) + "원 입니다.");
        System.out.println("DIAMOND 등급의 할인 금액은 " + Grade.DIAMOND.discount(price) + "원 입니다.");
    }
}
