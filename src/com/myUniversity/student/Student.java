package com.myUniversity.student;

public class Student implements Comparable<Student> {
   private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // comparable 인터페이스를 구현한다.
    // implements 실행한다.
    // 자바 객체를 특정 필드로 정렬하는 방법
    // java sort by specific field
    // @Override
    public int compareTo(Student o) {
    return this.name.compareTo(o.name);
    }

}
