package ch05;

// 찍어내는 틀, 정보를 저장하고 기능을 쓸 수 있는 객체(object)를 생성할 때
public class Student  {
    private String name;
    private int grade;

    // 메서드: 기능(function)
    // 학생 이름(name)을 입력 저장하는 기술
    // CRUD (crate read update delete)
    // 매개변수(parameter)
    // 반환값이 없기 때문에 void를 씀

    // 메서드선언 할 때
    // 1. public (99.99%)
    // 2. 메서드 이름(camel-case 사용)
    // 3. 입력값을 받냐/안받냐
    // -> 입력을 받는다 (매개변수선언)
    //     -> 매개변수선언 -> 매개변수의 이름부터
    //                      -> 매개변수의 자료형
    // 4. 구현할 코드를 작성
    // 5. 반환값이 있는지? : 메서드를 실행(호출)하고 나서 튀어나오는 값이 있는지?
    //      -> 있다/없다 -> 반환타입을 메서드명을 앞에 적어줌

    public void setName(String name) {
        // 학생이름을 입력받아서 저장
        // 객체 필드에 저장
        this.name = name;
    }

    // 학생 정보의 이름을 가져오는 메서드
    // 학생이름 필드에 넣었네, 필드값을 반환하면 되겠다.
    // 반환값의 자료형이 String
    public String getName() {
        return this.name;

    }

}
