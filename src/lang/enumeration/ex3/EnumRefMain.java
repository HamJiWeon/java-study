package lang.enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC: " + Grade.BASIC.getClass());
        System.out.println("class GOLD: " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND: " + Grade.DIAMOND.getClass());

        // enum은 자동으로 toString()을 해준다.
        System.out.println("ref BASIC: " + Grade.BASIC);

        System.out.println("grade BASIC: " + refValue(Grade.BASIC));
        System.out.println("grade BASIC: " + refValue(Grade.GOLD));
        System.out.println("grade BASIC: " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
