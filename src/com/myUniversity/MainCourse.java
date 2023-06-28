package com.myUniversity;

import com.myUniversity.courses.Course;
import com.myUniversity.student.Student;

public class MainCourse {
    public static void main(String[] agrs){
        Course c = new Course("자바, 고급프로그래밍", 14);
        c.joinStudent(new Student("한상혁"));
        c.joinStudent(new Student("아무나"));

        System.out.println("-- 참가한 학생");

        Student[] students = c.getStudents();
        for (int i = 0; i < c.getNumOfStudents(); i++) {
            System.out.println(students[i].getName());
        }
    }
}
