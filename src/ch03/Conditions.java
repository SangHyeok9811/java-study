package ch03;

public class Conditions {
    public static void main (String[] args){
        // 조건문(conditions)
        // 코드를 실행할지 말지를 결정하는데 사용한다.
        // 프로그램의 로직(logic)을 제어하는 핵심적인 부분

        // if 문

        /*
        if (조건식) {
            식이 true 일 때 실행할 구문
            }
         */
        // 조건식: true/false일 때 실행할 구문
        int age = 45;

        if(age >= 18) {
            System.out.println("성인입니다.");
        }
            System.out.println("프로그램이 종료되었습니다");
        System.out.println("----------------------------------------------");

        // if-else 문
        // if문의 조건식이 true이면, if 블록{} dksdml zhemrk tlfgod
        // if문의 조건식이 false면, else 블록{} 안의 코드가 실행
//        if(age >= 18) {
//            System.out.println("성인입니다.");
//        }else{
//            System.out.println("미성년자입니다.");
//        }

        //if-else + elseif
        if(age >= 60) {
            System.out.println("노인입니다");
        } else if(age >= 40){
            System.out.println("장년입니다.");
        } else if(age >= 18){
           System.out.println("성인입니다.");
        } else{
            System.out.println("미성년자입니다,");
        }
//        if (조건식1) {
//            // 조건식1이 참일 때 실행되는 코드
//        } else if (조건식2) {
//            // 조건식1이 거짓이고, 조건식2가 참일 때 실행되는 코드
//        } else if (조건식3) {
//            // 조건식1과 조건식2가 모두 거짓이고, 조건식3이 참일 때 실행되는 코드
//        } else {
//            // 모든 조건식이 거짓일 때 실행되는 코드
//        }
    }
}
