package ch08.stuEx;

public class Student implements Gradable{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public void calculateGrade() {
        if (score >= 90) {
            System.out.println("A학점 입니다.");
        } else if (score >= 80) {
            System.out.println("B학점 입니다");
        } else {
            System.out.println("걍 F학점 하세요");
        }
    }

}
