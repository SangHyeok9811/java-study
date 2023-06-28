package ch07.courseP;


public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("java",1,"자바쌤");
        Course course2 = new OnlineCourse("Python",2,"파이썬쌤","naver");
        Course course3 = new LectureCourse("C++",3,"C++쌤","103호","11:00");
        Course course4 = new OnlineCourse("JavaScript",4, "자바쌤","daum");
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);
        courseManager.addCourse(course4);
        courseManager.printCourses();
        courseManager.getCourseByInstructor("자바쌤");
        }
    }
