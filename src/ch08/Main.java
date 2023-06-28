package ch08;

public class Main {
    public static void main(String[] args) {
        // 인터페이스 객체 생성이 불가하다.
        // Shape s = new Shape();
        // 구현체로만 객체 생성이 가능하다.

        // 회사 경영진이 야, 원으로 하니까 후지네, 사각형으로 바꿔
        // 인터페이스를 쓰는 이유 1번째. 갈아끼우기가 쉽다.
        // 인터페이스 사용 이유
        // 1. 구현 클래스들의 기본 스펙(기능) 정의
        // 2.
        Shape s = new Rectangle(10,10);
//        Shape s = new Circle(5);
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());

    }
}
