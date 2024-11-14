package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity: " + (user1 == user2));        // false
        System.out.println("equality: " + (user1.equals(user2)));   // false
        // Object가 기본으로 제공하는 equals()는 동일성 ==으로 동일성 비교를 제공한다.

        /*
        equals 실행순서 예시
        user1.equals(user2)
        return (user1 == user2)  -> Object 메서드 안
        return (X001 == X002)    -> Object 메서드 안
        return false
        false
        */
    }
}
