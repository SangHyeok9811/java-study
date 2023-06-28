package ch03;

public class OperatorPriority {
    public static void main (String[] args){
        // 연산순서

        // 단항연산자(++,--,+/-,!)
        // 산술연산자(+,-,*,/,%)
        // 크기비교연산자(>,>=,<,<=)
        // 등치비교연산자(==,!=)
        // 논리연산자(&&,||)
        // 3항(?:)
        // 대입(:,=)

        // 대입 연산
        // +=, -=, ==, /=, %=
        int number = 10;
        // number = number + 10;
        number += 10;
        // number = number - 10;
        number -= 10;

        System.out.println(number);
    }
}
