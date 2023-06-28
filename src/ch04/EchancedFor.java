package ch04;

public class EchancedFor {
    public static void main(String[] args){
        // 향상된 for문
        // 배열같이 여러개의 값을 저장할 수 있는 자료구조를 순차적 탐색
        // 처음부터 끝까지 반복문을 돈다.
        // int i = 0; i < 배열크기; i++ -> 너무 자꾸써야해서 불편

        int[] numbers = {1, 2, 3, 4, 5};
        // 향상된 for문을 이용하여 배열 순회
        // numbers 값을 number로 들어가 출력
        for(int number : numbers){
            System.out.println(number);
        }
//
//        int[] numbers1 = { 1, 2, 3, 4, 5 };
//        int sum = 0;
//        for(int number:numbers1){
//            sum += number;
//        }
//        System.out.println("배열의 합: " + sum);
//
//        int[] numbers3 = {7, 14, 3, 8, 21, 5};
//        int max = numbers3[0];
//
//
//        System.out.println("최댓값: " + max);

    }
}


