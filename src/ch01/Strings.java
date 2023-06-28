package ch01;

public class Strings {
    public static void main(String[] args) {
        // string(문자열)
        // 문자를 여러개로 연결(문자의 배열)
        String greeting = "Hello, word!";

        // 자바에서 문자열(String)은 기본 자료형이 아니다.
        // char(문자타입)를 여러개 연결해서 작동되도록 구현
        /*
         String str = "abc";
         is equivalent to;
         char data[] = { 'a', 'b', 'c'};
         */

        // 문자열 초기화 방법
        // 문자열 값을 코드에 직접 입력한 것을 리터널(literal)
        String firstName = new String ("John");
        String lastName = "Doe";

        // 문자열 결합(concat)
        // 변수를 참조해서 사용할 때는 이름은 대소문자를 가린다.(case-sensitive)
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // 제어문자(escape characters, escape sequence)
        // 문자열 처리에 특수문자, 줄바꿈, 쌍따옴표, 탭 등
        // String message = ""이렇게 하고 싶은데"";
        // "메세지입니다."
        // 메세지입니다.

        // \를 사용하면 뒤의 문자를 인식시킴

        String message = "Hello\nWorld"; // 줄바꿈
        System.out.println(message);

        String tabMessage = "Hello\tWorld"; // 탭
        System.out.println(tabMessage);

        String doubleQuote = "\"Hello, World\"";
        System.out.println(doubleQuote);

        String back = "Hello\\World";
        System.out.println(back);

    }
}
