package ch01;

public class Casting {
    public static void main(String[] args){
        // 형변환(형식 변환, casting, Conversion)
        // casting(배우, 마법주문을 외운다)
        // 변수나 값의 자료형을 다른 자료형으로 변환하는 과정

        // 1. 묵시적 형변환(자동 형변환, implicit conversion)
        // implicit(묵시적) : 표기/표현을 안해 주어도 내부적으로 알아서 해주는 것
        // 웬만하면 잘 안 쓰는게 좋음. (알 수 없는 오류 가능성, side-effect, smell)
        int x = 10;
        System.out.println(x);
        double y = x;
        System.out.println(y);

        // 묵시적 변환의 원리는 더 좁은 값을 저장할 수 있는 변수를 더 넓은 값을 저장할 수 있는 변수에 대입
        /*
        double a = 10.5;
        int b = a;
         */

        // 명시적 형변환(explicit conversion)
        double a = 10.5;
        int b = (int) a;
        System.out.println(b);

        double d = 3.14;
        int e = (int) d;
        System.out.println(e);

        // char은 2바이트고 int는 4바이트. 문자는 애초에 숫자로 저장되어있음.

        // 완성형 코드를 저장한다.
        char c = 'ㄴ';
        int num = c;
        System.out.println(num);

        // 문자열 <-> 숫자 /많이 쓰임 (입력값은 문자열이나 계산 할 때는 숫자열로 변환하여 계산됨 이런느낌?)
        // "10" -> 10
        int number = 10;
        String str = Integer.toString(number);
        System.out.println(str);
        String strValue = String.valueOf(number);
        System.out.println(strValue);

        // 소숫점이 없는 10진수: decimal
        double decimal = 10.5;
        String strDecimal = Double.toString(decimal);
        System.out.println(strDecimal);
        String strDecimalValue = String.valueOf(decimal);
        System.out.println(strDecimalValue);
        // 숫자 => 문자열
        // String.valueOf(아무데이터타입값)
        // 자료형클래스.valueOf(문자열)

        // 문자열 -> 숫자 (당연히 안됨. 유니코드 값이 나옴)
        String numStr = "10";
        int num1 = Integer.valueOf(numStr);
        int num2 = Integer.parseInt(numStr);
        System.out.println(num1);
        System.out.println(num2);
        double num3 = Double.valueOf(numStr);
        System.out.println(num3);

        // Srting.valueOf(숫자자료형) : 숫자 -> 문자열
        // Integer.valueOf(문자열) : 문자열 -> 정수
        // Double.valueOf(문자열) : 문자열 -> 실수
        // 데이터타입.valueOf(입력값) : 입력값을 데이터타입의 값으로 변환

        // 자바의 숫자를 저장하자
        // 소수점 x : int
        // 소수점 x, 20억 넘을 것 같음 : long
        // 소수점 o : double
        // 글자를 저장 : String


        // 문제 1: 정수를 문자열로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 정수 123을 문자열로 변환하면 "123"이 출력되어야 합니다.
        int no = 123;
        String noStr = String.valueOf(no);
        System.out.println(noStr);

        // 문제 2: 실수를 문자열로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 실수 3.14를 문자열로 변환하면 "3.14"가 출력되어야 합니다.
        double no1 = 3.14;
        String no1Str = String.valueOf(no1);
        System.out.println(no1Str);

        // 문제 3: 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 문자열 "456"을 정수로 변환하면 숫자 456이 출력되어야 합니다.
        String str1 = "456";
        int strNo1 = Integer.valueOf(str1);
        System.out.println(strNo1);

        // 문제 4: 문자열을 실수로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 문자열 "2.718"을 실수로 변환하면 숫자 2.718이 출력되어야 합니다
        String str2 = "2.718";
        double strNo2 = Double.valueOf(str2);
        System.out.println(strNo2);


    }
}
