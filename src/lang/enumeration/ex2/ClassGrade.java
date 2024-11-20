package lang.enumeration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성 추가
    private ClassGrade() {

    }

}
