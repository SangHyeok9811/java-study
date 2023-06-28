package ch06.map;

import student1.Student;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();

        students.put(1, new Student("박지성", 13));
        students.put(2, new Student("손흥민", 11));
        students.put(3, new Student("차범근", 12));
        students.put(4, new Student("김민재", 13));
        students.put(5, new Student("이강인", 14));

        // 문제 3: 문제 2에서 생성한 맵에서 특정 학번의 학생을 검색하는 코드를 작성하세요.
        int targetStudentId = 3;    // 검색할 학번 변수 생성. 학번은 int타입이므로 int로 생성
        Student targetStudent = students.get(targetStudentId);  // 검색할 학생클래스의 id를 가져오도록 변수 생성. 학생클래스는 int, String 필드가 선언되어있음

        if (targetStudent != null) {        // targetStudet null이 아닐경우(클래스를 참조데이터로 쓰는 경우 null값을 넣을수 있음) 아이디랑 students.get(targetStudentId)의 이름과 나이 출력
            System.out.println(targetStudentId + " " + targetStudent.getName()
                    + " "  +  targetStudent.getAge());
        } else {
            System.out.println("결과값이 없습니다.");
        }
        System.out.println("-----------------------------");

        // 문제 4: 문제 2에서 생성한 맵에서 특정 학번의 학생을 제거하는 코드를 작성하세요.
        students.remove(targetStudentId);   // 맵변수.remove(키값)

        // 문제 5: 문제 2에서 생성한 맵의 모든 학생을 출력하는 코드를 작성하세요.
        for (int key : students.keySet()){  // 키 목록을 반환하는 향상된 for문
            System.out.println("학번: " + key + " 이름: " +
                    students.get(key).getName() + " 나이: " +
                    students.get(key).getAge());    // 반환된 key목록을 출력하는 코드
        }

        // 문제 6: 문제 2에서 생성한 맵에 있는 학생들의 나이 평균을 계산하는 코드를 작성하세요.
        double totalAge = 0;    // 학생들 나이를 더하는 값을 저장할 변수를 생성 (double로 해야 연산할 때 소수점이 나옴)
        for (Student student : students.values()) {     // 값 목록을 반환함
            totalAge += student.getAge();               // 토탈에이지에 HashMap에 저장된 나이를 더하기
        }
        double avgAge= totalAge / students.size();      // 해시맵(HashMap)에 저장된 요소의 개수를 반환하는 메소드
        System.out.println(avgAge);

        // 문제 7: 문제 2에서 생성한 맵에 있는 학생들 중 가장 나이가 많은 학생을 찾는 코드를 작성하세요.
        Student oldestStudent = null; // 데이터타입은 Student(String, int)이며 변수에 null값 할당
        for (Student student : students.values()) {
            if (oldestStudent == null || student.getAge() > oldestStudent.getAge()){    // 논리연산자. 논리연산에서 앞의 조건이 참일경우 뒤에는 연산을 안함?
                // 1번째 for을 돌면 student.getAge()는 13, oldestStudent.getAge()는 null
                // 2번째 for을 돌면 student.getAge()는 11, oldestStudent.getAge()는 13 ...
                // 그런데 2번째 for문을 돌았을 경우에는 oldestStudent.getAge()의 값이 더 크므로 oldestStudent = student;를 실행시키지 않음
                // 마지막 for을 돌면 student.getAge()는 14, oldestStudent.getAge()는 13 ...
                // 그 후 가장 큰 14의 값이 oldestStudent에 할당됨
                oldestStudent = student;        // 나이를 비교할 변수를 생성 처음 비교할 때 oldestStudent는 null 값으로 비교되고 그 다음은 1번째 필드값이 할당되어 비교하고, 그 다음은 2번째 필드로 할당되어 비교함.
            }
    }
        System.out.println(oldestStudent.getName() + oldestStudent.getAge());

}
}