package ch03;

import java.sql.SQLOutput;

public class ConditionsCase {
    public static void main (String[] args) {
        // switch문
        // 1주일에서 면번째 요일인가?
        int dayOfWeek = 8;
        // switch(변수){
        //}
        // switch문의 변수의 값에 따라 case 뒤의 값과 일치하는 구문을 실행
        // break를 쓰지 않으면, case에 맞는 코드를 실행 후 뒤에 있는 코드까지 실행됨
        // 가급적 break를 case 구문 가장 마지막에 쓴다.
        // 일치하는 case 문을 찾지못하면 default에 있는 코드를 실행한다.
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일입니다.");
                break;
            case 2:
                System.out.println("화요일입니다.");
                break;
            case 3:
                System.out.println("수요일입니다.");
                break;
            case 4:
                System.out.println("목요일입니다.");
                break;
            case 5:
                System.out.println("금요일입니다.");
                break;
            case 6:
                System.out.println("토요일입니다.");
                break;
            case 7:
                System.out.println("일요일입니다.");
                break;
            default:
                System.out.println("없습니다");
        }
        // if - else 로 변경
        if (dayOfWeek == 1){
            System.out.println("월요일입니다");
        } else if (dayOfWeek ==2){
            System.out.println("화요일입니다.");
        } else {
            System.out.println("귀찮다");
        }
    }
}
