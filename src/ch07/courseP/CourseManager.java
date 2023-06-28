package ch07.courseP;

import ch07.Lecturer;
import ch07.Person;
import ch07.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManager {
    private List<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }


    public void printCourses() {
        for (Course s : courses) {
            if (s instanceof OnlineCourse) {
                ((OnlineCourse) s).printOnline();
            } else if (s instanceof LectureCourse) {
                ((LectureCourse) s).printLecture();
            } else {
                System.out.println("과목: " + s.courseName + "/ 과목 번호: " + s.courseCode +
                        "/ 강사: " + s.instructor);
            }

        }
    }


    public List<Course> getCourseByInstructor(String instructor){
        List<Course> coursesByInstructor = new ArrayList<>();
        for (Course course : courses){
            if (course.getInstructor().equals(instructor)) {
                coursesByInstructor.add(course);
//                System.out.println("과목은: " + course.courseName);
            }
        }
        return coursesByInstructor;
    }

}