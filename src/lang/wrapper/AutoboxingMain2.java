package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // autoBoxing

        // Wrapper -> Primitive
        int unBoxedValue = boxedValue; // autoUnBoxing

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unBoxedValue = " + unBoxedValue);
    }
}
