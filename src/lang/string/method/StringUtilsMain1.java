package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString);

        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + boolString);

        String objString = String.valueOf(obj);
        System.out.println("숫자의 문자열 값: " + objString);

        // 문자 + x = 문자
        String numString2 = "" + num;

        // toCharArray 메서드
        char[] strToArray = str.toCharArray();
        System.out.print("문자열을 문자 배열로 변환: ");
        for (char x : strToArray) {
            System.out.print(x);
        }
    }
}
