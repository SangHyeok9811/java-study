package com.myUniversity.courses;

import ch05.accessModifier.Animal;
import com.myUniversity.student.Student;

import java.util.Scanner;

// 학과 과목과 관련된 기능을 제공해주는 클래스
public class CourseService {
    // 서비스를 실행할 수 있는 run 메서드
    // run 메서드를 Main.main 메서드에서 실행하면 됨.

    // 과목 목록 저장하는 배열
    // 키보드 입력 객체
    private Course[] courseList;
    private int courseCount;
    private Scanner scanner;

    public CourseService(int maxSize) {
        courseList = new Course[maxSize];
        courseCount = 1;
        scanner = new Scanner(System.in);
    }

    // 과목 생성 기능(createCourse)
    public void createCourse(String name, int maxStudent) {
        Course course = new Course(name, maxStudent);
        courseList[courseCount] = course;
        courseCount++;
    }


    // 과목에 참여 학생 추가 기능(assignCourse)
    public void assignCourse(String name){

    }

    // 과목에 참여한 학생 출력(showStudentsByCourseName)
    Animal animal = new Animal();

    public void test() {
        // protected 메서드는 다른 패키지에서 사용을 못함.
        // animal.eat();
    }
}
