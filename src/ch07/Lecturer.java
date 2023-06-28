package ch07;

public class Lecturer extends Person {
    private int careerTerm;

    public Lecturer(String name, int age, int careerTerm) {
        super(name,age);
        this.careerTerm = careerTerm;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("저의 강의 경력은 " + careerTerm + "년 입니다");
    }

    public void teach(){
        System.out.println(name + "님 이" + " 수업을 시작합니다.");
    }

}
