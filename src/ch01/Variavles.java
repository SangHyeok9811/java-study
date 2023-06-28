package ch01;

import javax.print.attribute.HashAttributeSet;

public class Variavles {
    public static void main(String[] args) {
        // 자바에서 변수(Variables)
        // 변수 -> 이번 축구 게임에 변수가 있어서 잘 안 됐어 ( 관련이 전혀없다 )
        // 변수: 이름이 있는 메모리 공간
        // 컴퓨터는 작업을 수해애하려면 메모리에 무언가가 올라가 있어야함
        // 프로그래밍: 프로그래밍은 언어(language)를 가지고 컴퓨터한테 일 시키는것

        // 고객(사용자) -> 개발자 -> 프로그래밍언어 -> 컴퓨터한테 일

        //  변수선언
        // int(integer , 정수 -2929, 0, 342, 소숫저ㅓㅁ 없는숫자, 0포함
        // age라는 이름에 공간에는 정수 값을 저장할수있다.
        //  Java Virtual Machine(자바 가상 기계)
        //- 컴파일된 자바 class 파일을 실행해주는 프로그램
        // int 형식 변수에 저장 가능한 숫자 범위 +,- 20억~21억 ->
        int age;
        // 값 할당(assignment)
        // 변수에 값을 저장
        age = 25;
        System.out.println(age);    // 로깅(logging), 작업 결과를 출력해서 확인

        // 변수이름
        // 숫자로 시작하면 안됨.
        // 일반적인(관례,convention) 소문자로 시작, 두번째 단어부터는 대문자로 시작
        // 이런형태의 변수이름 표기법을 comel-cose(카멜케이스) 표기법
        int studentAge;


    }
}
