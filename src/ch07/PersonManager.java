package ch07;

public class PersonManager {
    // 다형성을 이용해서
    // 현재 객체가 Student일 수 있고, Lecturer 일 수도 있음.
    public void work(Person p) { // p는 그냥 Person 클래스 객체를 입력받기 위한 변수명
        if(p instanceof Student) { // p가 Student 객체였으면 study() 실행
            ((Student) p).study();
        } else if (p instanceof Lecturer) { // p가 Lecturer 객체였으면 teach() 실행
            ((Lecturer) p).teach();
        }


    }
}
