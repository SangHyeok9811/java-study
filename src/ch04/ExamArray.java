package ch04;

import java.util.Scanner;

public class ExamArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        int numbers[] = new int [5];
//        numbers[2] = 7;
//        System.out.println(numbers[2]);

//        String [] code = new String[3];
//        code[0] = "Java";
//        code[1] = "Python";
//        code[2] = "C++";
//        for (int i = 0; i < code.length; i++) {
//            System.out.println(code[i]);
//        }

//        int[] numbers = new int[7];
//        numbers [0] = 1;
//        numbers [1] = 2;
//        numbers [2] = 3;
//        numbers [3] = 4;
//        numbers [4] = 5;
//        numbers [5] = 6;
//        numbers [6] = 7;
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]);
//        }

//        double[] values = new double[4];
//        for (int i = 0; i < values.length; i++){
//            System.out.println("값을 입력하세요: ");
//            values[i] = scanner.nextDouble();
//        }
//        for (int i = 0; i < values.length; i++){
//            System.out.print(" " + values[i]);
//        }
//        scanner.close();

        int[] numbers2 = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < numbers2.length; i++){
            System.out.print(numbers2[i]+" ");
        }

        int[] numbers3 = new int [4];
        for (int i = 0; i < numbers3.length; i++){
            System.out.println("값을 입력하세요:" );
            numbers3[i] = scanner.nextInt();
        }

    }
}
