package ch08;

public class Test {
    static void testArea(Shape s) {
        // 1. 기능: 너비 구하기 테스트
        double expectedResult = 100;
        double actualResult = s.calculateArea();

        if (actualResult == expectedResult) {
            System.out.println("1. 너비 구하기 테스트 성공(success)");
        } else {
            System.out.println("1. 너비 구하기 테스트오류(fail)");
        }

    }
    static void testPerimeter(Shape s){
        // 2. 기능: 둘레 구하기 테스트
        double expectedResult = 40;
        double actualResult = s.calculatePerimeter();

        if (actualResult == expectedResult) {
            System.out.println("2. 둘레 구하기 테스트 성공(success)");
        } else {
            System.out.println("2. 둘레 구하기 테스트오류(fail)");
        }

            }

    public static void main(String[] args) {
        // TOD 스타일로 개발
        Shape s = new Square(10);

        testArea(s);
        testPerimeter(s);

    }
}
