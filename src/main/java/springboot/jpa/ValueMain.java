package springboot.jpa;

public class ValueMain {

    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = a;

//        a.setValue(20); // 래퍼 클래스의 값을 변경할 방법은 없음

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
