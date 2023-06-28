// 패키지: 폴더,디렉토리
//        리펙토링으로 위치 이동 및 바꾸기

// 회사(com), 비영리조직(org)
// com, ---
// org, ---

// 2차
// 회사명, 조직명
// com.naver, com.wooahan
// org.apache, org.mazilla

// 3차
// 제품명, 서비스명, 도메인명(비즈니스범위명)
// com.naver.naver.search, com.naver.blog, com.naver.news

// 그 하위
// com.naver.news.sports.baseball
package com.myUniversity.courses;

import com.myUniversity.student.GreaduateStudent;
import com.myUniversity.student.Student;
import com.myUniversity.student.UndergreaduateStudent;

import java.util.Scanner;

// 다른 패키지에 있는 클래스를 가져다 쓰는 방법
// import 패키지명. ... 클래스명;
// import 패키지명 ...*;  // (잘안씀) 해당 패키지의 모든 클래스
// import com.myUniversity.students.Student.*; // 위 3개 모두 쓰고 싶을 때

public class Course {
    private String name;
    private Student[] students;
    private int maxStudent = 20;    // 과목에 몇명의 학생이 참여 가능한지
    private int numOfStudents = 0;   // 현재 과목에 몇명의 학생이 있는지
    private GreaduateStudent[] greaduateStudents;
    private UndergreaduateStudent[] undergreaduateStudents;

    // 해당 코스에 학생 참가(추가)
    public Course(String name, int maxStudent) {
        this.name = name;
        this.maxStudent = maxStudent;
        this.students = new Student[maxStudent];
    }

    public void joinStudent(Student student) {
        this.students[numOfStudents] = student;
        this.numOfStudents++;
        System.out.println("--" + student.getName() + "학생이 추가되었습니다. --");
    }

    public Student[] getStudents() {

        return students;
    }

    public int getNumOfStudents(){

        return numOfStudents;
    }

}
