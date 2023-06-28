package ch03;

public class TernaryOperator {
    public static void main (String[] args){
//        // 삼항연산자
//        // 항이 3개다
//        // 항은 연산의 대상
//        // 1헝 연산자: ++a
//        // 2항 연산자: a + b
//
//        // 3항 연산의 구조
//        // 조건식 ? 값1 : 값2
//        // 조건식의 값이 true 이면 ? 뒤의 값을 반환
//        // 조건식의 값이 false 이면 : 뒤의 값을 반환
//        // 조건식은 true/false 를 반환할 수 있는 식만 온다.
//        int num1 = 10;
//        int num2 = 5;
//        int max = (num1 > num2) ? num1 : num2;
//        System.out.println("더 큰 숫자는: " + max);
//        System.out.println("---------------------");
//
//        int num = 0;
//
//        String result = (num > 0) ? "양수" : ((num < 0) ? "음수" : "0");
//        System.out.println(result);

        int year = 1900;
        boolean year4 = ((year%4 == 0) ? true : false);
        boolean year100 = ((year%100 == 0) ? true : false);
        boolean year400 = ((year%400 == 0) ? true : false);
        String leapYear =  (((year4 && !year100) || year400) ? "윤년" : "윤년 아님");
        System.out.println(leapYear);
    }
}
