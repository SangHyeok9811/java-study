package ch07.courseP;

public class Course {
    String courseName;
    int courseCode;
    String instructor;

    public Course(String courseName, int courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getCourseCode() {
        return this.courseCode;
    }

    public String getInstructor() {
        return this.instructor;
    }

}
