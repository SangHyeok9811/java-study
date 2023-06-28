package ch03;

public class ExamLoop {
    public static void main(String[] args) {

// 문제 1: 1부터 10까지의 숫자를 출력하는 프로그램을 작성하세요.
//        for (int i = 1; i <= 10; i++){
//            System.out.print(i + " ");
//        }

// 문제 2: 1부터 100까지의 숫자 중에서 홀수만 출력하는 프로그램을 작성하세요.
//        for (int i = 1; i <= 100; i++){
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

// 문제 3: 구구단 중 5단을 출력하는 프로그램을 작성하세요
//        int j = 5;
//        String S = "단";
//        System.out.println(j + "단");
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(j + "X" + i + "=" + j*i);
//        }

// 문제 4: 10부터 1까지 역순으로 출력하는 프로그램을 작성하세요.
//        for (int i = 10; i > 0; i--){
//            System.out.println(i);
//        }

// 문제 5: 1부터 100까지의 숫자 중 3의 배수인 숫자들의 합을 계산하는 프로그램을 작성하세요.
//        int sum = 0;
//       for (int i = 1; i <= 100; i++){
//           if (i % 3 == 0) {
//               sum += i;
//           }
//       }
//        System.out.println("3의 배수의 합: " + sum);

// 문제 6: 0부터 100까지의 숫자 중에서 3의 배수이거나 5의 배수인 숫자들을 출력하는 프로그램을 작성하세요.
//        for (int i = 0; i <= 100; i++){
//            if (i % 3 == 0) {
//                System.out.println(i);
//            } else if (i % 5 == 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 0; i <= 100; i++){
//            if (i % 3 == 0 || i % 5 == 0){
//                System.out.println(i);
//            }
//        }

// 문제 8: 0부터 10까지의 숫자를 거꾸로 출력하는 프로그램을 작성하세요.
//        for (int i = 10; i >= 0; i--){
//            System.out.println(i);
//        }

// 문제 9: 구구단 중 7단을 거꾸로 출력하는 프로그램을 작성하세요.
//        int j = 7;
//        System.out.println("7단");
//        for (int i = 9; i >=1; i--) {
//            System.out.println(j + "X" + i + "=" + j*i);
//        }

// 111쪽 문제 1번
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0) {
//            System.out.println(i);
//            sum += i;
//            }
//        }
//        System.out.println(sum);

// 111쪽 문제 2번
//        int evenSum = 0;
//        int oddSum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0){
//                evenSum += i;
//            } else {
//                oddSum += i;
//            }
//        }
//        System.out.println(evenSum);
//        System.out.println(oddSum);

/// 111쪽 문제 3번

//    for (int x = 1; x <= 6; x++) {
//        for (int y = 1; y <= 6; y++) {
//            for (int xy = x + y; xy == 6;) {
//                System.out.println("(" + x + "," + y + ")");
//                break;
//            }
//        }
//    }

//        for (int x = 1; x <= 6; x++) {
//            for (int y = 1; y <= 6; y++) {
//                if (x + y == 6) {
//                    System.out.println("(" + x + "," + y + ")");
//                }
//            }
//        }

// 111쪽 4번
//        int rows = 5; // 출력할 행의 개수
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// 111쪽 5번
//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 5; j >= i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// 문제 10: 별 찍기 문제: 다음과 같이 별을 출력하는 프로그램을 작성하세요.
//        int rows = 5;
//
//        for (int i = 0; i < rows; i++){
//            for (int j = 0; j < rows -i -1; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i; k++){
//                System.out.print("*");
//            }
//            System.out.println();

            // 도트그래픽 2D(x, y축)
            // 행(가로, y) 이게 더 상위개념, 열(세로, x) 이게 하위 개념
            // 그러므로 반복문을 돌리려면, 가장 바깥 반복문이 행을 제어하는 반복문
            // 1번째 행 -> 1번째 열, 2번째 열, ..., 밑으로 내려가서
            // 2번째 행 -> 1번째 열, 2번째 열, ..., 밑으로 내려감

            // 행 개수
            int n = 10;

            for(int i = 1; i <= n; i++) {
                // i = 1, 첫번째행을 출력
                // i = 2, 두번째행을 출력

                // 빈 공간 출력
                // 5 - i(행번호) 만큼 출력
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");

            }
                // 별 출력
                // 2*i(행번호) -1만큼 출력
                for (int k = 1; k <= 2*i -1; k++) {
                    System.out.print("*");
                }

                // 밑줄로 내림
                System.out.println();
        }

    }
}
