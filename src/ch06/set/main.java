package ch06.set;

import com.myUniversity.student.Student;


import java.util.*;


public class main {
    public static void main(String[] args){
        Student s1 = new Student("한상혁");
        Student s2 = new Student("홍영기");
        Student s3 = s1;
        Student s4 = new Student("홍영기");

        // hashcode, 같은참조면 같은값
        System.out.println("s1:" + s1.hashCode());
        System.out.println("s2:" + s2.hashCode());
        System.out.println("s3:" + s3.hashCode());
        System.out.println("s4:" + s4.hashCode());

        // equals, 기본적으로 같은참조면 true이나, 바꿀 수 있다. (바꿀거면 equals 누르고 코드 추가?)
        System.out.println(s1.equals(s3));
        System.out.println("----------------------------------");

        // 객체 추가
        Set<String> sets = new HashSet<>();
        sets.add("apple");
        sets.add("banana");
        sets.add("cherry");
        sets.add("durian");
        sets.add("elderberry");

        // 객체 탐색
        for(String s : sets) {
            System.out.println(s);
        }

        // contains
        // 해당 값이 있나 없나
        System.out.println(sets.contains("cherry"));

        // 삭제
        sets.remove("cherry");
        System.out.println("-------------------------------------");
        List<String> lst = new ArrayList<>();
        lst.add("apple");
        lst.add("banana");
        lst.add("cherry");
        lst.add("durian");
        lst.add("elderberry");
        lst.add("durian");

        // 중복값 제거
        for (String s : lst) {
            System.out.println(s);
        }

        System.out.println("\"----------------------------------------\"");

        Set<String> set2 = new HashSet<>(lst);
        for (String s : set2) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------");
        // 컬렉션(리스트) -> set으로 초기화 생성
        // 중복제거, TreeSet으로 하면 중복제거에 정렬까지
        for (String s : new TreeSet<>(lst)) {
            System.out.println(s);
        }

    }
}
