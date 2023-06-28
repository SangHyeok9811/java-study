package ch09;

import student1.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List: 인터페이스, ArrayList: 구현클래스
        // <String>: 매개변수를 타입(클래스)으로 넣었습니다.
        // 매개변수를 타입으로 넣을 수 있게 하는 것이 제네릭(generic)
        List<String> list = new ArrayList<>(); // <> 에 아무 타입도 넣지않으면 모든 타입을 넣을수는 있음.
        // <>에 타입을 넣으면 메서드 매개변수에 넣은 타입이 지정됨.
//        list.add(1); // 에러발생, generic으로 String을 넣었기 때문에, Integer는 안됨.
        // 1. 타입을 컴파일 타임(코드 짜는 중)에 체크할 수 있다.
        list.add("aaa");
        list.add("bbb");


        for (Object s: list) {
            String str = (String) s;
        }

        // 기능을 타입(클래스)별로 만들지 않았어도 됨.
        // 2. 코드를 타입(클래스) 매개변수가지고 설계 재사용 가능함.
        List<Integer> lstNum = new ArrayList<>();
        lstNum.add(1);
        lstNum.add(2);

        // 오버로딩을 이용한 방법
//        Util util = new util();
//        // 오버로딩: add(Integer a, Integer b)
//        // add(String, a, String, b)

        // 제네릭
//        Util<타입> util = new Util();
//        public T add(T a, T b);

//        Util<Integer> util = new Util(); // 정수의 처리를 해주는 기능을 제공
//        public Integer add(Integer a, Integer b)
//        // util.add(3,4)

//        Util<String> // 문자열에 처리해주는 기능을 제공
//        public String add(String a, String b)
//        // util.add("adc","aaa")

        // 제네릭을 쓸 수 있는 상황: 연산이나 로직이 똑같음.
        // 메서드명을 같은 걸 쓰고, 매개변수개수도 같은 걸 사용.
        // 타입만 다르다.

        GenericStack<String> stack = new GenericStack<>();
        GenericStack<Student> stackStudent = new GenericStack<>();

        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }

}
