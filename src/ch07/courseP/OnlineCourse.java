package ch07.courseP;

public class OnlineCourse extends Course {
    private String platform;

    public OnlineCourse(String courseName, int courseCode, String instructor, String platform){
        super(courseName, courseCode, instructor);
        this.platform = platform;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void printOnline() {
        System.out.println("과목: " + courseName + "/ 과목 번호: " + courseCode +
                "/ 강사: " + instructor + "/ 플랫폼: " + platform);
    }

}
