package ch07.courseP;

public class LectureCourse extends Course {
    private String room;
    private String time;

    public LectureCourse (String courseName, int courseCode, String instructor, String room, String time) {
        super(courseName, courseCode, instructor);
        this.room = room;
        this.time = time;
    }

    public String getRoom() {
        return this.room;
    }

    public String getTime() {
        return this.time;
    }

    public void printLecture() {
        System.out.println("과목: " + courseName + "/ 과목 번호: " + courseCode +
                "/ 강사: " + instructor + "/ 강의실: " + room + "/ 시간: " + time);
    }


}
