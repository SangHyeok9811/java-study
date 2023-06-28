package ch08.ex01;

public class Human implements Playble, Walkable{

    @Override
    public void walk(){
        System.out.println("사람이 걷습니다.");
    }

    @Override
    public void play(){
        System.out.println("사람이 놉니다");
    }
}
