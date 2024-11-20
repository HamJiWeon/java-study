package lang.wrapper;

import com.sun.jdi.IntegerValue;

public class WrapperClassMain {

    public static void main(String[] args) {
        // Integer newInteger = new Integer(10); // 미래의 삭제 예정, 대신의 valueOf()를 사용
        Integer newInteger = Integer.valueOf(10);
        Integer integerObj = Integer.valueOf(10); // -128부터 127까지 자주 사용하는 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue );
        double doubleValue = doubleObj.doubleValue();
        System.out.println("doubleValue = " + doubleValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == intValue));
        System.out.println(".equals: " + newInteger.equals(intValue));
    }
}