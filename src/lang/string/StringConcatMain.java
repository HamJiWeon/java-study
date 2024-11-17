package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        String result2 = a + b;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2); // 문자열은 너무 많이 사용되기 때문에 편의상 +연산을 제공한다.
    }
}
