package ch06.map;

import com.myUniversity.student.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
    public static void main(String[] args) {
        // 해시맵(Hashmap)은 추가할 때 정렬x, 성능이 좀 더 좋음
        // 트리맵(Treemap)은 추가할 때 이진트리로 정렬, 성능이 떨어지지만 키값으로 정렬
        Map<String, Student> students = new HashMap<>();
//        Map<String, Student> students = new TreeMap<>(); 트리맵 이용하는 방법
        // 객체추가
        // 키(key, 유일값): 학번
        // 값(value): 학생정보
        // 맵변수.put(엔트리(K, V))
        students.put("e-01-000001", new Student("호날두"));
        students.put("e-01-000002", new Student("메시"));
        students.put("e-01-000003", new Student("루니"));
        students.put("e-01-000004", new Student("즐라탄"));

        // 객체검색/조회
        // 맵변수.keySet() -> key 목록을 반환함(키는 중복이 안됨)
        // Set: 집합, 원소의 중복이 없는 자료구조
        // 일반적으로 Map, 연관배열, dictionary, key-value, pair
        // 자료구조는 정렬해서 저장하지 않음
        for (String key : students.keySet()) {
            // 맵변수.get(키값) -> 값 객체
            System.out.println("학번: " + key + ", 학생명:" + students.get(key).getName());
        }

        // 맵변수.values() -> 값 목록을 반환함
        for (Student s : students.values()) {
            System.out.println(s.getName());
        }

        // 키 값 존재여부 확인
        boolean result = students.containsKey("e-01-00005");
        System.out.println(result);

        System.out.println("----------------------------------------------------");

        // 해시맵을 정렬된 트리맵으로 변환
//        Map<String, Student> sortedStundents = new TreeMap<>(students);

        for (String key : new TreeMap<>(students).keySet()) {
            // 맵변수.get(키값) -> 값 객체
            System.out.println("학번: " + key + ", 학생명:" + students.get(key).getName());
        }

        // 객체의 값 수정
        // 앱변수.get(키값): 키 값으로 조회 후 무언가를 처리할 수 있음
        Student s = students.get("e-01-000002");
        //setter 등으로 값 수정

        // 객체삭제
        // 맵변수.remove(키값): 특정 키값의 엔트리(key-value쌍)를 삭제
        students.remove("e-01-000003");
        // 모두 삭제
        students.clear();
    }
}
