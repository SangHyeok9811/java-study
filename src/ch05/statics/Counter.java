package ch05.statics;

public class Counter {
    // static 필드
    // 클래스의 모든 객체에 값이 공유됨(값이 메모리에 저장?)
    private static int count = 0;

    public Counter() {
        count++;        // 정적 변수 값 증가
    }

    public static int getCount() {
        return count++; // 정적 변수 값 반환
    }

}
