package ch05;

public class Utils {
    // 05. 클래스-연습문제-02.메서드 5개를 작성
    // 문제 1: 두 개의 정수를 매개변수로 받아서, 그 합을 반환하는 sum이라는 이름의 메서드를 작성하시오
    public int sum(int num1, int num2) {
        int val = num1 + num2;
        System.out.println("결과는 " + val + " 입니다");
        return val;
    }

    // 문제 2: 두 개의 정수를 매개변수로 받아서 그 중 더 큰 수를 반환하는 findMax라는 메서드를 작성하세요
    public int findMax(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("더 큰 수는: " + num1);
            return num1;
        } else if(num2 > num1) {
            System.out.println("더 큰 수는: " + num2);
            return num2;
        } else {
            System.out.println("값이 동일합니다");
            return 0;
        }
    }


    // 문제 3: 정수 배열을 매개변수로 받아서 배열의 모든 요소를 더한 값을 반환하는 메서드를 작성하세요.
    public int sumArr(int[] arr){
        int sum = 0;

        for(int val : arr){
            // 누산(accumulation)
            // sum += val;
            sum = sum + val;
        }

        return sum;


    }
}



