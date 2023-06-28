package ch05;

public class MethodEx {
    public static void main(String[] args) {
        // Utils 클래스 객체를 생성하고 메서드를 실행
        Utils util = new Utils();
        // 메서드 호출(call)
        int num1 = 30;
        int num2 = 20;
        int a = 1;
        int b = 2;
//        int result = util.sum(num1, num2);
        // 결과값 변수명(result)

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        int resultSum = util.sumArr(arr);
//        System.out.println(resultSum);

        int resultFindMax = util.findMax(num2, num1);
    }
}