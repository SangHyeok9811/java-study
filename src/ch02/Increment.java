package ch02;

public class Increment {
    public static void main(String[] args){
       /*
        // increment, decrement(reduction)
        // 증가 또는 감소 연상
        int a = 10;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);
        // ++(쁠쁠), ++++(샵)
        // 증가 연산은 결과적으로 변수의 값을 증가시킨다.
        System.out.println(++a);
        System.out.println(a);

        System.out.println("-------------");

        // 후행 연산
        // 횬재 처리하고 있는 구문(statement)에서는 현재 값을 반영
        // 다음 구문부터 증가된 값이 반영
        System.out.println(a++);        //세미콜론으로 끝나는 1개의 단위를 구문, 식(expression)
        System.out.println(a++);
        System.out.println(a);
        System.out.println("------------------------");
        // 감소 연산
        int b = 5;
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
        System.out.println("------------------------");
        */

        // 1. 변수 x를 5로 초기화하고, 후위 증감 연산자를 사용하여 x의 값을 출력한 후, x의 값을 1만큼 증가시키세요.
        int x = 5;
        x += 1;
        System.out.println(x);

        // 2. 변수 y를 7로 초기화하고, 전위 증감 연산자를 사용하여 y의 값을 출력한 후, y의 값을 2만큼 감소시키세요.
        int y = 7;
        y -= 2;
        System.out.println(y);

        // 3. 변수 a를 10으로 초기화하고, 후위 증감 연산자를 사용하여 a의 값을 출력한 후, a의 값을 3만큼 감소시키세요.
        int a = 10;
        a -= 3;
        System.out.println(a);

        // 4. 변수 b를 15로 초기화하고, 전위 증감 연산자를 사용하여 b의 값을 출력한 후, b의 값을 4만큼 증가시키세요.
        int b = 15;
        b += 4;
        System.out.println(b);

        // 5. 변수 i를 3으로 초기화하고, 후위 증감 연산자를 사용하여 i의 값을 출력한 후, i의 값을 2만큼 증가시키세요.
        int i = 3;
        i += 2;
        System.out.println(i);

        // 6. 변수 j를 6으로 초기화하고, 전위 증감 연산자를 사용하여 j의 값을 출력한 후, j의 값을 1만큼 감소시키세요.
        int j = 6;
        System.out.println(--j);

        // 7. 변수 n을 8로 초기화하고, 후위 증감 연산자를 사용하여 n의 값을 출력한 후, n의 값을 3만큼 감소시키세요.
        int n = 8;
        n -= 3;
        System.out.println(n);

        // 8. 변수 m을 12로 초기화하고, 전위 증감 연산자를 사용하여 m의 값을 출력한 후, m의 값을 5만큼 증가시키세요.
        int m = 12;
        m += 5;
        System.out.println(m);

        // 9. 변수 p를 2로 초기화하고, 후위 증감 연산자를 사용하여 p의 값을 출력한 후, p의 값을 4만큼 증가시키세요.
        int p = 2;
        p += 4;
        System.out.println(p);

        // 10. 변수 q를 9로 초기화하고, 전위 증감 연산자를 사용하여 q의 값을 출력한 후, q의 값을 2만큼 감소시키세요.
        int q = 9;
        q -= 2;
        System.out.println(q);

    }
}
