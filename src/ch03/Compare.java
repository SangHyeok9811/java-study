package ch03;

public class Compare {
    public static void main (String[] args) {
        /*
        // 동등 비교 연산자
        // 똑같은지 비교
        int a = 5;
        int b = 3;
        boolean result = (a==b); // false
        System.out.println(result);

        // 부등 비교 연산자
        // not equal
        // !:not
        boolean resultNot = (a != b); // true
        System.out.println(resultNot);

        / 문자열 비교에는 ==, != 를 사용하지 않음

        String str1 = "abc";
        String str2 = "abc";
        boolean resultStr = (str1 == str2);
        boolean resultStrNot = (str1 != str2);
        System.out.println(resultStr);
        System.out.println(resultStrNot);
*/
        String str3 = new String("abc");
        String str4 = new String("abc");
        boolean resultStr1 = (str3 == str4);
        boolean resultStrNot1 = (str3 != str4);
        System.out.println(resultStr1);
        System.out.println(resultStrNot1);
        System.out.println("---------------------------------------------");
        // 자바에서 문자열 비교시 해당 비교연산자를 사용함.
        // 문자열변수명.equals(변수/값)
        boolean resultStr3 = (str3.equals(str4));
        // 논리적으로 반대의 연산을 하고 싶을 때, !
        // 정확히는 결과값이 반대로 반환됨
        boolean resultStrNot3 = (!str3.equals(str4));
        System.out.println(resultStr3);
        System.out.println(resultStrNot3);
    }
}
