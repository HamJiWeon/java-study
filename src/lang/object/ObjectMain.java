package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        // toString()은 일단 객체의 대한 정보를 출력해주는 것이라고 생각하면 됨.
        String string = child.toString();
        System.out.println(string); // lang.object.Child@3feba861
    }
}
// 객체의 정보를 제공하는 toString()
// 객체의 같음을 비교하는 equals()
// 객체의 클래스 정보를 재공하는 getClass()