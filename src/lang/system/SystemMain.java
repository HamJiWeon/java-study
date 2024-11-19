package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentNanoTime = System.nanoTime();
        System.out.println("currentNanoTime = " + currentNanoTime);

        // 환경 변수를 읽는다.
        System.out.println("getenv = " + System.getenv());
        System.out.println("javaVersion: " + System.getProperty("java.version"));

        // 배열을 고속으로 읽는다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        for (char x : copiedArray) System.out.println("copiedArray = " + x);
        System.out.println(Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
    }
}
