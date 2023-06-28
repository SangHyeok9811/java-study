package ch03;

public class ExamConditions {
    public static void main (String[] args){
//        int x = 7;
//        if(x > 10) {
//            System.out.println("큰 수");
//        } else{
//            System.out.println("작은 수");
//        }

//        int score = 70;
//        if(score >= 80) {
//            System.out.println("통과");
//        } else {
//            System.out.println("불통과");
//        }

//         int num = 1;
//         if (num > 0){
//             System.out.println("양수");
//         } else if(num == 0){
//            System.out.println("0");
//        } else{
//             System.out.println("음수");
//         }

//        int age = 19;
//        if (age >= 20){
//            System.out.println("성인");
//        } else {
//            System.out.println("미성년자");
//        }

//        int month = 15;
//        switch (month){
//            case 1:
//                System.out.println("january");
//                break;
//            case 2:
//                System.out.println("february");
//                break;
//            case 3:
//                System.out.println("march");
//                break;
//            case 4:
//                System.out.println("april");
//                break;
//            case 5:
//                System.out.println("may");
//                break;
//            case 6:
//                System.out.println("june");
//                break;
//            case 7:
//                System.out.println("july");
//                break;
//            case 8:
//                System.out.println("august");
//                break;
//            case 9:
//                System.out.println("september");
//                break;
//            case 10:
//                System.out.println("october");
//                break;
//            case 11:
//                System.out.println("november");
//                break;
//            case 12:
//                System.out.println("december");
//                break;
//            default:
//                System.out.println("없습니다.");
//        }

//        int year = 2024;
//        if (year%400==0||(year%4==0&&!(year%100==0))){
//            System.out.println("윤년");
//        } else {
//            System.out.println("평년");
//        }

//        int num1 = 2;
//        int num2 = 2;
//        if (num1 == num2){
//            System.out.println("같음");
//        } else{
//            System.out.println("다름");
//        }

//        int a = 0;
//        int b = 0;
//        int c = 0;
//        if (a>0&&b>0&&c>0){
//            System.out.println("양수");
//        } else if (a==0&&b==0&&c==0) {
//            System.out.println("0");
//        } else{
//            System.out.println("음수");
//        }

        int a = -6;
        int b = 1;
        int c = 11;
        if (a > 0 && b > 0 && c > 0){
            System.out.println("양수");
        } else if (a < 0 || b < 0|| c < 0) {
            System.out.println("음수");
        } else{
            System.out.println("0");
        }
    }
}
